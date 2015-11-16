/**
 * Created by eric on 2015/11/16.
 */
public class XForYDiscount implements Discount {

    private final Item item;
    private final int buy;
    private final int money;

    public XForYDiscount(Item item, int buy, int money) {
        this.item = item;
        this.buy = buy;
        this.money = money;
    }

    public double discount(Cart cart) {
        double discount = 0;
        double discountPrice;
        for (Product product : cart.getProductList()) {
            if (product.getItem().equals(item)) {
                discountPrice = (buy * product.getPrice().doubleValue()) - money;
                double value = discountPrice * (product.getCounts() / buy);
                discount += value;
                System.out.println("[XForYDiscount] Product " + product.getItem().getName() + " discount :" + value);
            }
        }
        return discount;
    }
}
