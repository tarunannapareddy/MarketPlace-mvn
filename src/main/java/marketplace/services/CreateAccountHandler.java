package marketplace.services;


import grpc.BuyerOuterClass;
import grpc.SellerOuterClass;
import grpc.User;
import io.grpc.ManagedChannel;
import marketplace.Exceptions.InvalidDataException;
import marketplace.dao.BuyerDAO;
import marketplace.dao.SellerDAO;
import marketplace.dao.UserDAO;
import marketplace.dbConnector.GrpcConnector;
import marketplace.pojos.Buyer;
import marketplace.pojos.Request.CreateAccountRequest;
import marketplace.pojos.Seller;
import marketplace.pojos.Session;
import marketplace.pojos.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CreateAccountHandler{
    @Autowired
    public UserDAO userDAO;
    @Autowired
    public BuyerDAO buyerDAO;
    @Autowired
    public SellerDAO sellerDAO;

    private ManagedChannel channel = GrpcConnector.getCustomerConnection();

    public Object handle(Object request, Session session) throws InvalidDataException {
        CreateAccountRequest createAccountRequest = (CreateAccountRequest) request;

        User.CreateUserResponse response  = grpc.UserDAOServiceGrpc.newBlockingStub(channel).createUser(User.CreateUserRequest.newBuilder().setUserName(createAccountRequest.getUsername()).setPassword(createAccountRequest.getPassword()).build());
        int id = response.getUserId();
        if(id!=-1){
            if(UserType.BUYER.equals(createAccountRequest.getUserType())){
                grpc.BuyerServiceGrpc.newBlockingStub(channel).createBuyer(BuyerOuterClass.Buyer.newBuilder().setId(id).setName(createAccountRequest.getName()).build());
            }if(UserType.SELLER.equals(createAccountRequest.getUserType())){
                grpc.SellerServiceGrpc.newBlockingStub(channel).createSeller(SellerOuterClass.Seller.newBuilder().setId(id).setName(createAccountRequest.getName()).build());
            }
        }
        session.setSessionId(id);
        return id;
    }
}
