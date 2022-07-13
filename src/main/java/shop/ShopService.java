package shop;

import shop.order.Order;
import shop.order.OrderRepo;
import shop.product.Product;
import shop.product.ProductRepo;

import java.util.ArrayList;
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

    public void addOrder(int orderId, List<Integer> productIds){
        List<Product> products=new ArrayList<>();

        for (int productid : productIds){
            Product product=productRepo.getProduct(productid);
            products.add(product);
        }

        Order order=new Order(orderId, products);
        orderRepo.addOrder(order);
    }

    public Order getOrder(int orderId){
        return orderRepo.getOrder(orderId);

    }

    public List<Order> listOrder(){
        return orderRepo.listOrders();
    }

}
