package dream.factory.learning.chapter7.vice.teaching.interfaces;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Trci trac = new Trci(2, new Suma());
        Thread thread = new Thread(trac);

        thread.start();
        //trac.run();

        thread.join();
        System.out.println("bubi");
    }

}
