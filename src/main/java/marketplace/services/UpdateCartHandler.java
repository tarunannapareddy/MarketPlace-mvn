package marketplace.services;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import grpc.Cart;
import grpc.ItemOuterClass;
import io.grpc.ManagedChannel;
import marketplace.Exceptions.InvalidDataException;
import marketplace.dao.CartDAO;
import marketplace.dao.ItemDAO;
import marketplace.dbConnector.GrpcConnector;
import marketplace.pojos.Item;
import marketplace.pojos.Request.UpdateCartRequest;
import marketplace.pojos.Session;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class UpdateCartHandler {
    @Autowired
    private CartDAO cartDAO;

    @Autowired
    private ItemDAO itemDAO;

    @Autowired
    private RequestHandler requestHandler;


    private ManagedChannel channel = GrpcConnector.getCustomerConnection();

    public Object handle(Object request, Session session) throws InvalidDataException, IOException {
        UpdateCartRequest updateCartRequest = (UpdateCartRequest) request;
        ObjectMapper objectMapper = new ObjectMapper();

        JSONObject payload = new JSONObject();
        payload.put("query_type", "cart");
        payload.put("query_key", "create_cart");
        payload.put("buyer_id", updateCartRequest.getBuyerId());

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("type", "put");
        jsonObject.put("payload", payload);

        String response = RequestHandler.sendPutRequest("http://localhost:5002/request", jsonObject.toString());
        Map<String, Object> values = objectMapper.readValue( response, new TypeReference<Map<String, Object>>() {});
        int cartId = (int) values.get("result");
        System.out.println(cartId);
        JSONObject payload2 = new JSONObject();
        payload2.put("query_type", "cart");
        payload2.put("query_key", "update_cart_quantity");
        payload2.put("cart_id", cartId);
        payload2.put("item_id", updateCartRequest.getItemId());
        payload2.put("quantity_change", updateCartRequest.getQuantity());

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("type", "put");
        jsonObject2.put("payload", payload);

        String response2 = RequestHandler.sendPutRequest("http://localhost:5002/request", jsonObject2.toString());
        Map<String, Object> values2 = objectMapper.readValue( response2, new TypeReference<Map<String, Object>>() {});
        return ((int) values2.get("result")) != 0;
/*
        if(updateCartRequest.isSaveCart()){
            return true;
        } else if(updateCartRequest.isResetCart()){
            return grpc.CartServiceGrpc.newBlockingStub(channel).deleteCart(Cart.DeleteCartRequest.newBuilder().setCartId(cartId).build()).getSuccess();
        }

        ItemOuterClass.Item item = grpc.ItemServiceGrpc.newBlockingStub(channel).getItem(ItemOuterClass.GetItemRequest.newBuilder().setItemId(updateCartRequest.getItemId()).build());
        if(item.getQuantity() < updateCartRequest.getQuantity()){
            return false;
        }
        return grpc.CartServiceGrpc.newBlockingStub(channel).updateCartQuantity(Cart.UpdateCartQuantityRequest.newBuilder().setCartId(cartId).setItemId(updateCartRequest.getItemId()).setQuantityChange(updateCartRequest.getQuantity()).build()).getSuccess();
        */
    }
}
