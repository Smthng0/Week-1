package dream.factory.learning.chapter7.vice.teaching.staticlearn;

public class CategoryStatic {
    private static String GLOBAL = "k";
    private String name;
    public CategoryStatic(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void setGLOBAL(String input){
        GLOBAL = input;
    }
    public static String getBla () {
        return GLOBAL;
    }
}
