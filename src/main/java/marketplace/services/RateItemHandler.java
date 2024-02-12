package marketplace.services;


import grpc.Feedback;
import grpc.ItemOuterClass;
import grpc.SellerOuterClass;
import io.grpc.ManagedChannel;
import marketplace.Exceptions.InvalidDataException;
import marketplace.dao.FeedBackDAO;
import marketplace.dao.ItemDAO;
import marketplace.dao.SellerDAO;
import marketplace.dbConnector.GrpcConnector;
import marketplace.pojos.Item;
import marketplace.pojos.Request.RateItemRequest;
import marketplace.pojos.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateItemHandler{
    @Autowired
    private ItemDAO itemDAO;
    @Autowired
    private SellerDAO sellerDAO;
    @Autowired
    private FeedBackDAO feedBackDAO;

    private ManagedChannel channel = GrpcConnector.getCustomerConnection();

    public Object handle(Object request, Session session) throws InvalidDataException {
        RateItemRequest rateItemRequest = (RateItemRequest)  request;
        /*
        if(!session.getSessionId().equals(rateItemRequest.getBuyerId())){
            throw new InvalidDataException("User not Authorised");
        }
         */
        ItemOuterClass.Item item = grpc.ItemServiceGrpc.newBlockingStub(channel).getItem(ItemOuterClass.GetItemRequest.newBuilder().setItemId(rateItemRequest.itemId).build());
        Feedback.CheckFeedbackExistenceResponse response = grpc.FeedbackServiceGrpc.newBlockingStub(channel).checkFeedbackExistence(Feedback.CheckFeedbackExistenceRequest.newBuilder().setItemId(rateItemRequest.itemId).setBuyerId(rateItemRequest.buyerId).build());
        if(response.getExists()) {
            return false;
        }
        grpc.FeedbackServiceGrpc.newBlockingStub(channel).saveFeedback(Feedback.SaveFeedbackRequest.newBuilder().setItemId(rateItemRequest.itemId).setBuyerId(rateItemRequest.buyerId).setFeedback(rateItemRequest.feedback).build());
        SellerOuterClass.UpdateReviewCountsResponse reviewCountsResponse = grpc.SellerServiceGrpc.newBlockingStub(channel).updateReviewCounts(SellerOuterClass.UpdateReviewCountsRequest.newBuilder().setSellerId(item.getSellerId()).setReview(rateItemRequest.feedback).build());
        return reviewCountsResponse.getSuccess();
    }
}
