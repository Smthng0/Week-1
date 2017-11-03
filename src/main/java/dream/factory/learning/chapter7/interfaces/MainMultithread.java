package dream.factory.learning.chapter7.interfaces;

public class MainMultithread {
    public static void main(String[] args) throws InterruptedException {
        Thread[] mojiThreadovi = new Thread[1000];
        Suma suma = new Suma();

        for(int i = 0; i < 1000; i++){
            Trci trac = new Trci(i, suma);
            Thread thread = new Thread(trac);
            if(i % 2 == 0){
                mojiThreadovi[i] = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.print("baba");
                    }
                });
            } else {
                mojiThreadovi[i] = thread;
            }
        }

        for (Thread thread : mojiThreadovi) {
            thread.start();
        }

        for (Thread thread : mojiThreadovi) {
            thread.join();
        }

        //Thread.sleep(2000);


        System.out.println(suma.getSuma());
    }

}
