package marketplace.pojos.Request;

import java.io.Serializable;


public class LogInRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    public String username;
    public String password;

    public LogInRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
