package dream.factory.learning.chapter7.vice.teaching.inheritance;

public class Panties extends Product {
    private boolean cipka;

    public Panties(String name, Category category, boolean cipka) {
        super(name, category);
        this.cipka = cipka;
    }

    @Override
    public String toString() {
        return super.toString() + " , cipka: " + cipka;
    }

    public boolean isCipka() {
        return cipka;
    }
}
