package marketplace.pojos.Request;

import java.io.Serializable;

public class RateItemRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public int buyerId;

    public String itemId;

    public boolean feedback;

    public RateItemRequest(int buyerId, String itemId, boolean feedback) {
        this.buyerId = buyerId;
        this.itemId = itemId;
        this.feedback = feedback;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public boolean isFeedback() {
        return feedback;
    }

    public void setFeedback(boolean feedback) {
        this.feedback = feedback;
    }
}
