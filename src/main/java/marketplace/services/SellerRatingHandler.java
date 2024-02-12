package marketplace.services;


import grpc.SellerOuterClass;
import io.grpc.ManagedChannel;
import marketplace.dao.SellerDAO;
import marketplace.dbConnector.GrpcConnector;
import marketplace.pojos.Seller;
import marketplace.pojos.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerRatingHandler {
    @Autowired
    private SellerDAO sellerDAO;

    private ManagedChannel channel = GrpcConnector.getCustomerConnection();

    public Object handle(Object request, Session sessionId) {
        Integer id = (Integer) request;
        SellerOuterClass.Seller seller = grpc.SellerServiceGrpc.newBlockingStub(channel).getSellerInfo(SellerOuterClass.GetSellerInfoRequest.newBuilder().setSellerId(id).build());
        double total = seller.getNegativeReviewCount()+seller.getPositiveReviewCount();
        if(total ==0){
            return (double)-1;
        }
        return seller.getPositiveReviewCount()/total;
    }
}
