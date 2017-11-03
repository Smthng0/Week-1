package dream.factory.learning.chapter7.vice.teaching.interfaces;

public class Trci implements Runnable{
    int n = 0;
    private Suma suma;

    public Trci(int n, Suma suma) {
        this.suma = suma;
        this.n = n;
    }

    public void run() {

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

        }
        suma.increment();
        System.out.println("Trčim... " + n);

    }
}
