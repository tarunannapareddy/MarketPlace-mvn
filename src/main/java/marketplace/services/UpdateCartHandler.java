package marketplace.services;


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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateCartHandler {
    @Autowired
    private CartDAO cartDAO;

    @Autowired
    private ItemDAO itemDAO;

    private ManagedChannel channel = GrpcConnector.getCustomerConnection();

    public Object handle(Object request, Session session) throws InvalidDataException {
        UpdateCartRequest updateCartRequest = (UpdateCartRequest) request;
        /*
        if(!session.getSessionId().equals(updateCartRequest.getBuyerId())){
            throw  new InvalidDataException("User Not Authorised");
        }
         */
        Cart.GetCartResponse response = grpc.CartServiceGrpc.newBlockingStub(channel).getCart(Cart.GetCartRequest.newBuilder().setBuyerId(updateCartRequest.getBuyerId()).build());
        int cartId = response.getCartId();
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
    }
}
