package dream.factory.learning.chapter1;

public class Bottles {
    public static void main (String[] arg) {
        int brojBoca=99;
                while (brojBoca>0) {
            hrvatskeBoce(brojBoca);
            brojBoca=brojBoca - 1;
        }

        System.out.println("Mane ševi vepi na duzi.... :(");

    }


    private static void hrvatskeBoce(int brojBoca) {
        String word="boca";
        switch (brojBoca){
            case 12:
            case 13:
            case 14:
                word = "boca";
                break;
            default:
                word = bocinator(brojBoca);
        }

        if(brojBoca < 99){
            System.out.println(brojBoca + " " + word + " pive je na zidu...");
        }

        System.out.println(brojBoca + " " + word + " pive je na zidu...");
        System.out.println(brojBoca + " " + word + " pive...");
        System.out.println("Šmugni jednu...");
        System.out.println("Cibni ju dalje...");
    }

    private static String bocinator(int brojBoca) {
        switch (brojBoca % 10){
            case 2:
            case 3:
            case 4:
                return  "boce";

            default:
                return  "boca";
        }
    }


}
