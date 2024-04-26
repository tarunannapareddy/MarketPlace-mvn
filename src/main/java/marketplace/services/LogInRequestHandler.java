package marketplace.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dbservice.Execute;
import io.grpc.ManagedChannel;
import marketplace.Exceptions.InvalidDataException;
import marketplace.dao.UserDAO;
import marketplace.dbConnector.GrpcConnector;
import marketplace.pojos.Request.LogInRequest;
import marketplace.pojos.Session;
import marketplace.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class LogInRequestHandler{
    @Autowired
    public UserDAO userDAO;
    private ManagedChannel channel = GrpcConnector.getCustomerConnection();

    public Object handle(Object request, Session session) throws InvalidDataException, IOException {
        LogInRequest loginRequest = (LogInRequest) request;
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> data = new HashMap<>();
        data.put("userName",loginRequest.username );
        data.put("password", loginRequest.password);
        String jsonString = objectMapper.writeValueAsString(data);
        Execute.ExecuteResponse response = dbservice.DBServiceGrpc.newBlockingStub(channel).execute(Execute.QueryRequest.newBuilder().setTable("user").setFunction("getUser_with_details").setInput(jsonString).build());
        if(response == null) {
            throw new InvalidDataException("invalid username or Password");
        }
        Map<String, Object> values = objectMapper.readValue((String) response.getResponse(), new TypeReference<Map<String, Object>>() {});
        return values.get("id");
    }
}
