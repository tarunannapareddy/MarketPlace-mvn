package marketplace.services;


import grpc.ItemOuterClass;
import io.grpc.ManagedChannel;
import marketplace.Exceptions.InvalidDataException;
import marketplace.dao.ItemDAO;
import marketplace.dbConnector.GrpcConnector;
import marketplace.pojos.Item;
import marketplace.pojos.Request.RemoveItemRequest;
import marketplace.pojos.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveItemHandler{
    @Autowired
    private ItemDAO itemDAO;

    private ManagedChannel channel = GrpcConnector.getCustomerConnection();


    public Object handle(Object request, Session session) throws InvalidDataException {
        RemoveItemRequest item = (RemoveItemRequest) request;
        ItemOuterClass.Item itemInfo = grpc.ItemServiceGrpc.newBlockingStub(channel).getItem(ItemOuterClass.GetItemRequest.newBuilder().setItemId(item.itemId).build());
        /*
        if(!session.getSessionId().equals(itemInfo.getSellerId())){
            throw new InvalidDataException("User Not authorised");
        }
         */
        ItemOuterClass.UpdateItemQuantityResponse response = grpc.ItemServiceGrpc.newBlockingStub(channel).updateItemQuantity(ItemOuterClass.UpdateItemQuantityRequest.newBuilder().setItemId(item.itemId).setQuantityToReduce(item.quantity).build());
        return response.getSuccess();
    }
}
