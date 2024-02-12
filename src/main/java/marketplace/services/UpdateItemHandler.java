package marketplace.services;


import grpc.ItemOuterClass;
import io.grpc.ManagedChannel;
import marketplace.Exceptions.InvalidDataException;
import marketplace.dao.ItemDAO;
import marketplace.dbConnector.GrpcConnector;
import marketplace.pojos.Item;
import marketplace.pojos.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateItemHandler {
    @Autowired
    private ItemDAO itemDAO;

    private ManagedChannel channel = GrpcConnector.getCustomerConnection();

    public Object handle(Object request, Session session) throws InvalidDataException {
        Item item = (Item) request;
        /*
        if(!session.getSessionId().equals(item.getSellerId())){
            throw  new InvalidDataException("User Not Authorised");
        }
         */
        return grpc.ItemServiceGrpc.newBlockingStub(channel).updateItemPrice(ItemOuterClass.UpdateItemPriceRequest.newBuilder().setItemId(item.getItemId()).setNewSalePrice(item.getSalePrice()).build()).getSuccess();

    }
}
