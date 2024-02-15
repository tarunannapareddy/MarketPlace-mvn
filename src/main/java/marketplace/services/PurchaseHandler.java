package marketplace.services;


import marketplace.dao.CartDAO;
import marketplace.dao.ItemDAO;
import marketplace.dao.OrderDAO;
import marketplace.dbConnector.ConnectionManager;
import marketplace.dbConnector.DBConnector;
import marketplace.pojos.CartItem;
import marketplace.pojos.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soap.ws.client.generated.*;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
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

    public String purchase(int buyerId) throws SQLException {
        int cartId = cartDAO.getCart(buyerId);
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
        TransactionServiceService service = new TransactionServiceService();
        TransactionService port = service.getTransactionServiceSoap11();
        Transaction transaction = new Transaction();
        transaction.setTransactionId(transactionId);
        transaction.setPrice(price);

        ProcessTransactionRequest request = new ProcessTransactionRequest();
        request.setTransaction(transaction);
        String status = "SUCCESS";
        try{
            status = port.processTransaction(request).getStatus();
            }catch (Exception e){
                System.out.println("exception "+e);
            }

        return status;
    }

}
