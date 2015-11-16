import java.util.ArrayList;
import java.util.List;

/**
 * Created by eric on 2015/11/13.
 */
public class Cart {

    private List<Product> productList = new ArrayList<Product>();


    public void addProduct(Product product){
        productList.add(product);
    }

//    public List<Product> getProductById(Product product){
//        List<Product> products = new ArrayList<Product>();
//        for(Product p : productList){
//            if(p.isProduct(product)){
//                products.add(p);
//            }
//        }
//        return  products;
//    }

    public List<Product> getProductList() {
        return productList;
    }

    public void removeCart(){
        productList = new ArrayList<Product>();
    }
}
