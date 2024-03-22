package marketplace.services;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dbservice.DBServiceGrpc;
import dbservice.Execute;
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

import java.util.HashMap;
import java.util.Map;

@Service
public class CreateAccountHandler{
    @Autowired
    public UserDAO userDAO;
    @Autowired
    public BuyerDAO buyerDAO;
    @Autowired
    public SellerDAO sellerDAO;

    private ManagedChannel channel = GrpcConnector.getCustomerConnection();

    public Object handle(Object request, Session session) throws InvalidDataException, JsonProcessingException {
        CreateAccountRequest createAccountRequest = (CreateAccountRequest) request;
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> data = new HashMap<>();
        data.put("userName",createAccountRequest.getUsername() );
        data.put("password", createAccountRequest.getPassword());
        String jsonString = objectMapper.writeValueAsString(data);
        Execute.ExecuteResponse response = dbservice.DBServiceGrpc.newBlockingStub(channel).execute(Execute.QueryRequest.newBuilder().setTable("user").setFunction("createUser").setInput(jsonString).build());
        int id = Integer.parseInt(response.getResponse());
        /*
        if(id!=-1){
            if(UserType.BUYER.equals(createAccountRequest.getUserType())){
                grpc.BuyerServiceGrpc.newBlockingStub(channel).createBuyer(BuyerOuterClass.Buyer.newBuilder().setId(id).setName(createAccountRequest.getName()).build());
            }if(UserType.SELLER.equals(createAccountRequest.getUserType())){
                grpc.SellerServiceGrpc.newBlockingStub(channel).createSeller(SellerOuterClass.Seller.newBuilder().setId(id).setName(createAccountRequest.getName()).build());
            }
        }
         */
        session.setSessionId(id);
        return id;
    }
}
