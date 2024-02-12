package marketplace.services;

import org.springframework.stereotype.Service;
import marketplace.pojos.Request.CreateAccountRequest;

@Service
public class UserService {
    public int createAccount(CreateAccountRequest request){
        return 1;
    }
}
