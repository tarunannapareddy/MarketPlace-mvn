package marketplace.pojos.Request;

import java.io.Serializable;

public class SearchItemRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    public int category;
    public String [] keyWords;

    public SearchItemRequest(int category, String[] keyWords) {
        this.category = category;
        this.keyWords = keyWords;
    }
}
