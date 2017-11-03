package dream.factory.learning.chapter7.staticlearn;


public class MainStatics {
    public static void main(String[] args) {
       System.out.println(CategoryStatic.getBla());
       CategoryStatic kat1 = new CategoryStatic("kategorija 1");
       printCategoryStatic(kat1);
       CategoryStatic.setGLOBAL("novi");
       printCategoryStatic(kat1);
       CategoryStatic drugi = new CategoryStatic("drugi");
       printCategoryStatic(drugi);
       drugi.setGLOBAL("drugi global");
       printCategoryStatic(kat1);
    }

    private static void printCategoryStatic(CategoryStatic cat) {
        System.out.println("Moj cat " + cat.getName() + " global: " + cat.getBla());
    }
}
