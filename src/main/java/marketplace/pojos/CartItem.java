package marketplace.pojos;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CartItem {
    private int id;
    private int cart_id;
    private int quantity;
    private String item_id;

}
