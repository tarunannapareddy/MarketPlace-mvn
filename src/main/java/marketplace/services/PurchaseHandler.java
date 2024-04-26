package marketplace.services;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import marketplace.dao.CartDAO;
import marketplace.dao.ItemDAO;
import marketplace.dao.OrderDAO;
import marketplace.dbConnector.ConnectionManager;
import marketplace.dbConnector.DBConnector;
import marketplace.pojos.CartItem;
import marketplace.pojos.Item;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class PurchaseHandler {

    @Autowired
    private CartDAO cartDAO;

    @Autowired
    private ItemDAO itemDAO;
    @Autowired
    private OrderDAO orderDAO;

    //ExecutorService executorService = Executors.newFixedThreadPool(2);

    public String purchase(int buyerId) throws SQLException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        JSONObject payload = new JSONObject();
        payload.put("query_type", "cart");
        payload.put("query_key", "get_cart");
        payload.put("buyer_id", buyerId);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("type", "put");
        jsonObject.put("payload", payload);

        String response = RequestHandler.sendPutRequest("http://localhost:5002/request", jsonObject.toString());
        Map<String, Object> values = objectMapper.readValue( response, new TypeReference<Map<String, Object>>() {});
        int cartId = (int) values.get("result");

        payload = new JSONObject();
        payload.put("query_type", "cart");
        payload.put("query_key", "get_cart_items");
        payload.put("cart_id", cartId);

        jsonObject = new JSONObject();
        jsonObject.put("type", "put");
        jsonObject.put("payload", payload);

        response = RequestHandler.sendPutRequest("http://localhost:5002/request", jsonObject.toString());
        values = objectMapper.readValue( response, new TypeReference<Map<String, Object>>() {});


        List<CartItem> cartItems = cartDAO.getCartItems(cartId);
        System.out.println(ConnectionManager.getTransactionLevel(DBConnector.getProductConnection()));
        return order(buyerId, cartItems);
        /*
        //String transactionId =  order(buyerId, cartItems);
        Future<String> orderFuture = executorService.submit(() -> order(buyerId, cartItems));
        Future<String> order2Future = executorService.submit(() -> order2(buyerId, cartItems));

        try {
            String transactionId = orderFuture.get(); // Wait for the first order to complete
            String transactionId2 = order2Future.get(); // Wait for the second order to complete
            System.out.println(transactionId+" "+transactionId2);
        } catch (Exception e) {
            System.out.println("Error occurred during purchase: " + e.getMessage());
        }
        return "";
         */
    }
    private String order(int buyerId, List<CartItem> cartItems) throws SQLException {
        ConnectionManager.setAutoCommit(DBConnector.getProductConnection(), false);
        ConnectionManager.setTransactionLevel(DBConnector.getProductConnection(), 8);
        System.out.println("order "+ConnectionManager.getTransactionLevel(DBConnector.getProductConnection()));
        double price =0;
        for(CartItem cartItem : cartItems){
            Item item = itemDAO.getItem(cartItem.getItem_id());
            price += item.getSalePrice()*cartItem.getQuantity();
            if(item.getQuantity() < cartItem.getQuantity()){
                System.out.println("some items does not exist in store");
                return "";
            }
        }
        String transactionId = UUID.randomUUID().toString();
        int order = orderDAO.createOrder(buyerId, "IN_PROGRESS",transactionId);
        for(CartItem cartItem : cartItems){
            if(itemDAO.updateItemQuantity(cartItem.getItem_id(), cartItem.getQuantity())){
                orderDAO.updateOrderItem(order, cartItem.getQuantity(), cartItem.getItem_id());
            } else{
                System.out.println("could not update quantity");
                return "";
            }
        }

        String status = processTransaction(transactionId, price);
        orderDAO.updateOrder(status, transactionId);
        ConnectionManager.commit(DBConnector.getProductConnection());
        ConnectionManager.setAutoCommit(DBConnector.getProductConnection(), true);
        ConnectionManager.setTransactionLevel(DBConnector.getProductConnection(), 2);
        return transactionId;
    }

    String processTransaction(String transactionId, double price){
        return "SUCCESS";
    }

}
