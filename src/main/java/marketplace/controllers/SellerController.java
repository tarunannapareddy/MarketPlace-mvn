package marketplace.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import marketplace.Exceptions.InvalidDataException;
import marketplace.pojos.Item;
import marketplace.pojos.Request.*;
import marketplace.pojos.Session;
import marketplace.pojos.UserType;
import marketplace.services.*;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    private CreateAccountHandler createAccountHandler;
    @Autowired
    private LogInRequestHandler logInRequestHandler;

    @Autowired
    private AddItemHandler addItemHandler;

    @Autowired
    private UpdateItemHandler updateItemHandler;
    @Autowired
    private RemoveItemHandler removeItemHandler;
    @Autowired
    private SellerRatingHandler sellerRatingHandler;

    static Session session = new Session(-1);

    @PostMapping("/register")
    public ResponseEntity<?> createAccount(@RequestBody Map<String, String> requestBody){
        try {

            String userName = requestBody.get("username");
            String password = requestBody.get("password");
            CreateAccountRequest createAccountRequest = new CreateAccountRequest(userName,password, UserType.SELLER, userName);
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
            } catch (Exception e) { // Catch other unexpected exceptions
                return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid request body format.");
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String,String> requestBody){
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
                return  (ResponseEntity<?>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid request body format.");
        }
    }


    @PostMapping("/item")
    public ResponseEntity<?> addItem(@RequestBody Item item){
        try {
            String itemId = (String)addItemHandler.handle(item,session);
            if(itemId!=null){
                String message="Item Successfully created with id:"+itemId;
                return ResponseEntity.status(HttpStatus.CREATED).body(message);
            }else {
                return  (ResponseEntity<?>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }catch (InvalidDataException e) {
            return ResponseEntity.badRequest().body(e.getMessage());}
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid request body format.");
        }
    }

    //    Update item
    @PutMapping("/item/{sellerId}/{itemId}")
    public ResponseEntity<?> updateItem(@PathVariable("sellerId") Integer sellerId,
                                        @PathVariable("itemId") String itemId,
                                        @RequestParam("salePrice") Double salePrice){
        Item updateRequest=new Item(itemId,sellerId,salePrice);
        try {
            boolean response = (boolean) updateItemHandler.handle(updateRequest,session);
            if(response){
                return ResponseEntity.ok("Item price updated Successfully");
            }else {
                return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Unable to update item");
            }
        }catch (InvalidDataException e) {
            return ResponseEntity.badRequest().body(e.getMessage());}
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid request body format.");
        }
    }

    //    removeItem
    @DeleteMapping("/item/{sellerId}/{itemId}")
    public ResponseEntity<?> removeItem(@PathVariable("sellerId") Integer sellerId,
                                        @PathVariable("itemId") String itemId,
                                        @RequestParam("quantity") Integer quantity){
        RemoveItemRequest removeItemRequest= new RemoveItemRequest(itemId,sellerId,quantity);
        try{
            boolean response =(boolean) removeItemHandler.handle(removeItemRequest,session);
            if(response){
                return ResponseEntity.ok("Item quantity updated Successfully");
            }else {
                return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Unable to update item");
            }

        }catch (InvalidDataException e) {
            return ResponseEntity.badRequest().body(e.getMessage());}
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid request body format.");
        }

    }

    //seller rating
    @GetMapping("/rating")
    public ResponseEntity<?> getRating(@RequestParam("sellerId") int sellerId){
        Object getratingrequest=sellerId;
        try {
            Double rating = (Double) sellerRatingHandler.handle(getratingrequest, session);
            String message = "Seller rating is:" + rating;
            return ResponseEntity.ok(message);
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid request body format.");
        }

    }


}
