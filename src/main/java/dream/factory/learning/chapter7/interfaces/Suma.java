package dream.factory.learning.chapter7.interfaces;

public class Suma {
    private int suma = 0;

    public synchronized void increment(){
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {

        }
        suma++;
    }

    public  int getSuma() {
        return suma;
    }
}
