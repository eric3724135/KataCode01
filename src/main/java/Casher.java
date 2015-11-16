import java.util.ArrayList;
import java.util.List;

/**
 * Created by eric on 2015/11/13.
 */
public class Casher {

    private List<Discount> discounts = new ArrayList<Discount>();

    public double calculate(Cart cart) {
        double total = getTotalPrice(cart);
        total -= discountStrategy(cart);
        return total;
    }



    private double getTotalPrice(Cart cart) {
        double total = 0.0d;
        for (Product p : cart.getProductList()) {
            double proPrice = p.getTotalPrice();
            System.out.println("Product " + p.getItem().getName() + " orignal total price is " + proPrice);
            total += proPrice;
        }
        return total;
    }

    private double discountStrategy(Cart cart) {
        double dicountVal = 0.0d;
        for (Discount discount:discounts){
            dicountVal += discount.discount(cart);
        }
        return dicountVal;
    }

    public void addDiscountStrategy(Discount discount){
        discounts.add(discount);
    }
}
