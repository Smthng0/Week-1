package dream.factory.learning.chapter7.vice.teaching.inheritance;

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
