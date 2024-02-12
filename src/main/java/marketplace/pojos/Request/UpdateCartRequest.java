package marketplace.pojos.Request;


import java.io.Serializable;

public class UpdateCartRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    private String itemId;
    private int quantity;

    private int buyerId;

    private boolean saveCart;
    private boolean resetCart;

    public UpdateCartRequest(int buyerId, String itemId, int quantity) {
        this.buyerId = buyerId;
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public UpdateCartRequest(int buyerId, boolean resetCart) {
        this.buyerId = buyerId;
        this.resetCart = resetCart;
    }

    public String getItemId() {
        return itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public boolean isSaveCart() {
        return saveCart;
    }

    public boolean isResetCart() {
        return resetCart;
    }
}
