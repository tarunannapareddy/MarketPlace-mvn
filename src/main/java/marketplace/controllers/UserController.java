package marketplace.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import marketplace.pojos.Request.CreateAccountRequest;
import marketplace.services.UserService;

@RestController
@RequestMapping("/marketplace/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public Integer createUser(@RequestBody CreateAccountRequest createAccountRequest) {
        return userService.createAccount(createAccountRequest);
    }
}
