package shop;

import shop.order.OrderRepo;
import shop.product.Product;
import shop.product.ProductRepo;

import java.util.List;

public class ShopService {

    private final ProductRepo productRepo;
    private  final OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }
    public Product getProduct(int id){
        return productRepo.getProduct(id);
    }

    public List<Product> listProducts(){
        return productRepo.productList();
    }

}
