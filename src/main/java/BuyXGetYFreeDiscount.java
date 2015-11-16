/**
 * Created by eric on 2015/11/16.
 */
public class BuyXGetYFreeDiscount implements Discount {
    private final Item item;
    private final int buy;
    private final int free;


    public BuyXGetYFreeDiscount(Item item, int buy, int free) {
        this.item = item;
        this.buy = buy;
        this.free = free;
    }

    public double discount(Cart cart) {
        double discount = 0;
        for (Product product : cart.getProductList()) {
            if (product.getItem().equals(item)) {
                double value = (product.getCounts() / buy) * free * product.getPrice().doubleValue();
                discount += value;
                System.out.println("[BuyXGetYFreeDiscount] Product " + product.getItem().getName() + " discount :" + value);
            }
        }

        return discount;
    }


}
