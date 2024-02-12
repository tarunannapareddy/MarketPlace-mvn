package marketplace.pojos;

public class Seller {
    Integer id;
    String name;
    Integer positiveReviewCount;
    Integer negativeReviewCount;
    Integer totalSold;

    public Seller(Integer id, String name, Integer positiveReviewCount, Integer negativeReviewCount, Integer totalSold) {
        this.id = id;
        this.name = name;
        this.positiveReviewCount = positiveReviewCount;
        this.negativeReviewCount = negativeReviewCount;
        this.totalSold = totalSold;
    }

    public Seller(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPositiveReviewCount() {
        return positiveReviewCount;
    }

    public Integer getNegativeReviewCount() {
        return negativeReviewCount;
    }

    public Integer getTotalSold() {
        return totalSold;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPositiveReviewCount(Integer positiveReviewCount) {
        this.positiveReviewCount = positiveReviewCount;
    }

    public void setNegativeReviewCount(Integer negativeReviewCount) {
        this.negativeReviewCount = negativeReviewCount;
    }

    public void setTotalSold(Integer totalSold) {
        this.totalSold = totalSold;
    }
}
