package marketplace.controllers;

import marketplace.Exceptions.InvalidDataException;
import marketplace.pojos.Item;
import marketplace.pojos.Request.*;
import marketplace.pojos.Session;
import marketplace.pojos.UserType;
import marketplace.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/buyer")
public class  BuyerController {

    @Autowired
    private CreateAccountHandler createAccountHandler;
    @Autowired
    private LogInRequestHandler logInRequestHandler;
    @Autowired
    private SearchItemHandler searchItemHandler;
    @Autowired
    private RateItemHandler rateItemHandler;

    @Autowired
    private PurchaseHandler purchaseHandler;

    @Autowired
    private UpdateCartHandler updateCartHandler;

    static Session session = new Session(-1);

    @PostMapping("/register")
    public ResponseEntity<?> createAccount(@RequestBody Map<String, String> requestBody){
        try {
            String userName = requestBody.get("username");
            String password = requestBody.get("password");
            CreateAccountRequest createAccountRequest = new CreateAccountRequest(userName,password, UserType.BUYER, userName);
            try {
                Integer accountId = (Integer)createAccountHandler.handle(createAccountRequest,session);
                if(accountId != null){
                    String message="User Successfully created with id:"+accountId;
                    return ResponseEntity.status(HttpStatus.CREATED).body(message);
                }else {
                    return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } catch (InvalidDataException e) {
                return ResponseEntity.badRequest().body(e.getMessage());
            } catch (Exception e) {
                return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid request body format.");
        }
    }

    //login
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> requestBody){
        try {
            String userName = requestBody.get("username");
            String password = requestBody.get("password");
            LogInRequest loginRequest = new LogInRequest(userName, password);
            try {
                Integer id = (Integer) logInRequestHandler.handle(loginRequest, session);
                return ResponseEntity.ok(id);
            } catch (InvalidDataException e) {
                return ResponseEntity.badRequest().body(e.getMessage());
            } catch (Exception e) {
                return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid request body format.");
        }
    }

    //search
    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam("category") Integer category, @RequestParam("keywords") List<String> keywords){
        String[] keywordArray=new String[keywords.size()];
        for(int i =0;i<keywords.size();i++){
            keywordArray[i]=keywords.get(i);
        }
        SearchItemRequest searchItemRequest= new SearchItemRequest(category,keywordArray);
        try {
            List<Item> items = (List<Item>) searchItemHandler.handle(searchItemRequest,session);
            if(items.size()==0){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No items found.");
            }else{
                return ResponseEntity.ok(items);
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid request body format.");
        }
    }

    @PostMapping("/feedback/{buyerId}/{itemId}")
    public ResponseEntity<?> submitFeedback(@PathVariable("buyerId") int buyerId,
                                            @PathVariable("itemId") String itemId,
                                            @RequestBody Map<String, Boolean> requestBody){
        RateItemRequest rateItemRequest = new RateItemRequest(buyerId,itemId, requestBody.get("feedback"));
        try{
            Boolean response = (Boolean) rateItemHandler.handle(rateItemRequest,session);
            if (response){
                return ResponseEntity.ok("Feedback Posted Successfully");
            }else {
                return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Unable to post feedback.");
            }
        }catch(Exception e) {
            return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/cart/update/{buyerId}/{itemId}")
    public ResponseEntity<?> updateCart(@PathVariable("buyerId") int buyerId,
                                        @PathVariable("itemId") String itemId,
                                        @RequestParam("quantity") int quantity ){
        UpdateCartRequest updateCartRequest = new UpdateCartRequest(buyerId,itemId,quantity);
        try{
            Boolean response = (Boolean) updateCartHandler.handle(updateCartRequest,session);
            if (response){
                return ResponseEntity.ok("Cart updated Successfully");
            }else {
                return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Unable to update cart");
            }
        }catch(Exception e) {
            return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //reset Cart
    @PutMapping("/cart/reset/{buyerId}")
    public ResponseEntity<?> resetCart(@PathVariable("buyerId") int buyerId){
        UpdateCartRequest updateCartRequest = new UpdateCartRequest(buyerId,true);
        try{
            Boolean response = (Boolean) updateCartHandler.handle(updateCartRequest,session);
            if (response){
                return ResponseEntity.ok("Cart Reset Successfully");
            }else {
                return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Unable to reset cart");
            }
        }catch(Exception e) {
            return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/purchase/{buyerId}")
    public ResponseEntity<?> purchase(@PathVariable("buyerId") int buyerId){
        try {
            String transaction = purchaseHandler.purchase(buyerId);
            return ResponseEntity.ok(transaction);
        } catch (Exception e) {
            return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
