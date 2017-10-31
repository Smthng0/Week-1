package chapter1;

public class bottles {
    public static void main (String[] arg) {
        int brojBoca=99;
        String word="boce"; //kod nas je za jedninu i mnozinu boca (drugi naglasak=, ali sam namjerno "e" stavio...

        while (brojBoca>0) {

            if (brojBoca==1) {
                word = "boca";
            }

            System.out.println(brojBoca + " " + word + " pive je na zidu...");
            System.out.println(brojBoca + " " + word + " pive...");
            System.out.println("Šmugni jednu...");
            System.out.println("Cibni ju dalje...");
            brojBoca=brojBoca - 1;

            if (brojBoca>0){
                System.out.println(brojBoca + " " + word + " pive je na zidu...");
            } else {
                System.out.println("Mane ševi vepi na duzi.... :(");
            }


        }


    }


}
