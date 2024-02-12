package marketplace.pojos.Request;

import java.io.Serializable;

public class RemoveItemRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    public String itemId;

    public Integer quantity;

    public Integer sellerId;

    public RemoveItemRequest(String itemId, Integer sellerId, Integer quantity) {
        this.itemId = itemId;
        this.sellerId = sellerId;
        this.quantity = quantity;
    }
}
