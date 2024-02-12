package marketplace.services;


import grpc.ItemOuterClass;
import grpc.ItemServiceGrpc;
import io.grpc.ManagedChannel;
import marketplace.dao.ItemDAO;
import marketplace.dbConnector.GrpcConnector;
import marketplace.pojos.Item;
import marketplace.pojos.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class GetItemsHandler{
    @Autowired
    private ItemDAO itemDAO;
    private ManagedChannel channel = GrpcConnector.getCustomerConnection();


    public Object handle(Object request, Session sessionId) {
        List<Item> itemsList = new ArrayList();
        Integer sellerId = (Integer) request;
        Iterator<ItemOuterClass.Item> items = ItemServiceGrpc.newBlockingStub(channel).getItemsBySellerId(ItemOuterClass.GetItemsBySellerIdRequest.newBuilder().setSellerId(sellerId).build());
        return items;
    }
}
