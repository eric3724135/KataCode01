import org.junit.Before;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by eric on 2015/11/16.
 */
public class CasherTest {

    public Casher casher;
    public Item item;
    public Item item2;

    @Before
    public void setUp() throws Exception {
        casher = new Casher();
        item = new Item(1, "APPLE");
        item2 = new Item(2, "BANANA");
        casher.addDiscountStrategy(new BuyXGetYFreeDiscount(item, 3, 1));
        casher.addDiscountStrategy(new XForYDiscount(item2, 3, 10));
    }

    @org.junit.Test
    public void testCalculate() throws Exception {
        Cart cart = new Cart();
        //cart.addProduct(new Product(item, 6, new BigDecimal(2)));
        cart.addProduct(new Product(item2, 5, new BigDecimal(5)));
        System.out.println("Total Price : "+casher.calculate(cart));
    }
}