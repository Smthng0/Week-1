package dream.factory.learning.chapter7.example.inheritance;

import dream.factory.learning.chapter7.example.inheritance.Category;

public class Product {
    private float price;
    private String name = "nesto";
    private Category category;


    public Product(float price, String name, Category category) {
        this.price = price;
        this.name = name;
        this.category = category == null ? new Category("default") : category;

    }

    public Product(float price, String name) {
        this(price, name, null);
    }

    public Product(Category category) {
        this(0.0f, "bez price i name", category);
    }

    public Product(String name, Category category) {
        this(0.0f, name, category);

    }

    public Product() {
        this(0.0f, "bez icega", null);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Moj override: Price: " + price + " , Name: " + name + " , Category: " + category.toString();
    }
}
