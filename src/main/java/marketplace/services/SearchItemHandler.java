package marketplace.services;


import grpc.ItemOuterClass;
import grpc.ItemServiceGrpc;
import io.grpc.ManagedChannel;
import marketplace.dao.ItemDAO;
import marketplace.dbConnector.GrpcConnector;
import marketplace.pojos.Item;
import marketplace.pojos.Request.SearchItemRequest;
import marketplace.pojos.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class SearchItemHandler {
    @Autowired
    private ItemDAO itemDAO;

    private ManagedChannel channel = GrpcConnector.getCustomerConnection();

    public Object handle(Object request, Session sessionId) {
        SearchItemRequest searchItemRequest = (SearchItemRequest) request;
        ItemOuterClass.GetItemsByCategoryAndKeywordsRequest.Builder requestBuilder = ItemOuterClass.GetItemsByCategoryAndKeywordsRequest.newBuilder();
        requestBuilder.setCategoryId(searchItemRequest.category);
        for (String keyword : searchItemRequest.keyWords) {
            requestBuilder.addKeywordsList(keyword);
        }
        Iterator<ItemOuterClass.Item> items = ItemServiceGrpc.newBlockingStub(channel)
                .getItemsByCategoryAndKeywords(requestBuilder.build());
        List<Item> itemList = new ArrayList<>();
        while (items.hasNext()) {
            ItemOuterClass.Item grpcItem = items.next();
            Item item = new Item();
            item.setId(grpcItem.getId());
            item.setItemId(grpcItem.getItemId());
            item.setName(grpcItem.getName());
            item.setCategory(grpcItem.getCategory());
            item.setCondition(grpcItem.getCondition());
            item.setQuantity(grpcItem.getQuantity());
            item.setSalePrice(grpcItem.getSalePrice());
            item.setSellerId(grpcItem.getSellerId());
            item.setKeyWords(grpcItem.getKeyWordsList().toArray(new String[0]));
            itemList.add(item);
        }
        return itemList;
    }
}
