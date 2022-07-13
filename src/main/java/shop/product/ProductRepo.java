package shop.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class ProductRepo {

    Map<Integer, Product> products = Map.of(

            1, new Product(1, "VW"),
            2, new Product(2, "BMW"),
            3, new Product(3, "Mercedes")
    );

    public Product getProduct(int id) {

        Product product = products.get(id);

        if (product == null) {
            throw new NoSuchElementException("No product with: " + id + "exists");
        }
        return product;
    }


    public List<Product> productList() {
        return new ArrayList<>(products.values());
    }


}
