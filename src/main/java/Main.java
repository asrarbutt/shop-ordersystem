import shop.product.ProductRepo;

public class Main {

    public static void main(String[] args) {
        ProductRepo productRepo=new ProductRepo();
        System.out.println(productRepo.productList());
    }
}
