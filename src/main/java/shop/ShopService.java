package shop;

import shop.order.OrderRepo;
import shop.product.ProductRepo;

public class ShopService {

    private final ProductRepo productRepo;
    private  final OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }


}
