package marketplace.services;

import io.grpc.ManagedChannel;
import marketplace.Exceptions.InvalidDataException;
import marketplace.dao.UserDAO;
import marketplace.dbConnector.GrpcConnector;
import marketplace.pojos.Request.LogInRequest;
import marketplace.pojos.Session;
import marketplace.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogInRequestHandler{
    @Autowired
    public UserDAO userDAO;
    private ManagedChannel channel = GrpcConnector.getCustomerConnection();

    public Object handle(Object request, Session session) throws InvalidDataException {
        LogInRequest loginRequest = (LogInRequest) request;
        grpc.User.GetUserResponse response = grpc.UserDAOServiceGrpc.newBlockingStub(channel).getAccount(grpc.User.GetAccountRequest.newBuilder().setUserName(loginRequest.username).setPassword(loginRequest.password).build());
        if(response == null){
            throw  new InvalidDataException("invalid username or Password");
        }
        session.setSessionId(response.getId());
        return response.getId();
    }
}
