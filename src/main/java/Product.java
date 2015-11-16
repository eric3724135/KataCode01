import java.math.BigDecimal;

/**
 * Created by eric on 2015/11/13.
 */
public class Product {

    private Item item;
    private int counts;
    private BigDecimal price;;

    public Product(Item item, int counts, BigDecimal price) {
        this.item = item;
        this.counts = counts;
        this.price = price;
    }

    public double getTotalPrice() {
        return price.multiply(new BigDecimal(counts)).doubleValue();
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
