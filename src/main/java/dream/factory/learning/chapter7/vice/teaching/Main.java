package dream.factory.learning.chapter7.vice.teaching;

import dream.factory.learning.chapter7.vice.teaching.inheritance.Category;
import dream.factory.learning.chapter7.vice.teaching.inheritance.Product;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setName("bla");
        product.setPrice(23423.23f);


        printProduct(product);
        product = new Product(2135.123f, product.getName());
        printProduct(product);
        product = new Product();
        printProduct(product);

        Category category = new Category("usb");
    }

    private static void printProduct(Product product) {
        System.out.println("Moj product " + product.getName() + " cijene " + product.getPrice());
    }
}
