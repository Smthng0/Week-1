package dream.factory.learning.chapter3;

/*
page 64, fridge exercise 3. there are x parts of code that are scrambled up and i need to sort them to make a working java program...
i can put as many curly braces as i want (because some are missing), the program needs to print out "island = Fiji" ln "island = Cozumel" ln "island = Bermuda" ln "island = Azores"
 */
public class TestArrays {

    public static void main(String[] args) {
        int y=0;
        String[] islands = new String[4];
        int[] index = new int[4];
        int ref;
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Conzumel";

        while (y < 4) {
            ref = index[y];
            System.out.print ("island = ");
            System.out.println (islands[ref]);
            y = y + 1;
        }
    }

}
