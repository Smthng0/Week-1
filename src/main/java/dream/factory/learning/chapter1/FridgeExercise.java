package dream.factory.learning.chapter1;


// str 20, prva vjezba u knjizi... rjesio sam da ne pise zadnji "-" tako sto sam dodao break u x==1, a mozda sam trebao nekako sa curly braces...

public class FridgeExercise {
    public static void main(String[] args) {

        int x = 3;

        while (x > 0) {

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
                break;  //rjesenje za zadnji -, ne znam eli trebalo nekako drukcije...
            }

            if (x == 2) {
                System.out.print("b c");
            }

            if (x > 2) {
                System.out.print("a");
            }

            x = x - 1;
            System.out.print("-");

        }


    }


}
