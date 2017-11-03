package dream.factory.learning.chapter7.example.inheritance;

public class Category {
    private String name;

    public Category (String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Moj override " + name;
    }
}
