package dream.factory.learning.chapter7.example.inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        Category category = new Category("usb");
        Product product = buildProduct(category);
        product.toString();


        // Pants panties = (Pants) product;
        // product.setCategory(category);
        Boolean boo = product instanceof Panties;

        if(boo){
            Panties panties = (Panties) product;
        }

        System.out.println("Is this panties? " + boo.toString());

        System.out.println(category.toString());
        System.out.println(product.toString());
    }

    private static Product buildProduct(Category category) {
        return new Panties("mudante", category, true);
    }

}
