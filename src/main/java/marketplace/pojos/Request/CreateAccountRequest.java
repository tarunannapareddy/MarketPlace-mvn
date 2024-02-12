package marketplace.pojos.Request;

import lombok.*;
import marketplace.pojos.UserType;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateAccountRequest{
    private String username;
    private String password;
    private UserType userType;
    private String name;

}
