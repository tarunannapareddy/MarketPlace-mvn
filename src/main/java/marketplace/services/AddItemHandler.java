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


import java.util.Arrays;
import java.util.Random;

@Service
public class AddItemHandler{
    @Autowired
    private ItemDAO itemDAO;

    private ManagedChannel channel = GrpcConnector.getCustomerConnection();


    public Object handle(Object request, Session session) throws InvalidDataException {
        Item item = (Item) request;
        Random rand = new Random();
        int rand_int1 = rand.nextInt(1000000);
        item.setItemId(item.getName()+"_"+item.getCategory()+"_"+rand_int1);
        ItemOuterClass.AddItemResponse response = grpc.ItemServiceGrpc.newBlockingStub(channel).addItem(ItemOuterClass.Item.newBuilder()
                .setCategory(item.getCategory()).setCondition(item.getCondition())
                .setName(item.getName()).setItemId(item.getItemId())
                .setQuantity(item.getQuantity()).setSalePrice(item.getSalePrice()).setSellerId(item.getSellerId())
                .addAllKeyWords(Arrays.asList(item.getKeyWords())).build());
        return response.getItemId();
    }
}
