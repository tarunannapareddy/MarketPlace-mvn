package marketplace.pojos;

public class Cart {
    private Integer cartId;
    private Integer buyerId;

    public Cart(Integer cartId, Integer buyerId) {
        this.cartId = cartId;
        this.buyerId = buyerId;
    }
}
