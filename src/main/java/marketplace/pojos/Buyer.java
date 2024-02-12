package marketplace.pojos;

public class Buyer {
    private Integer id;
    private String name;
    private Integer itemsPurchased;

    public Buyer(Integer id, String name, Integer itemsPurchased) {
        this.id = id;
        this.name = name;
        this.itemsPurchased = itemsPurchased;
    }

    public Buyer(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getItemsPurchased() {
        return itemsPurchased;
    }
}
