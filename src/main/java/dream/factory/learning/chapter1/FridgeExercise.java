package dream.factory.learning.chapter1;

/*
page 20, exercise 1... there are 8 parts of code that are scrambled up and i need to sort them to make a working java program...
i can put as many curly braces as i want (because some are missing), the program needs to print out "a-b c-d"
 */
public class FridgeExercise {

    public static void main(String[] args) {
        int x = 3;

        while (x > 0) {
            if (x == 2) {
                System.out.print("b c");
            }

            if (x > 2) {
                System.out.print("a");
            }

            x = x - 1;
            System.out.print("-");

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
    }

}
