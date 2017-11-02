package dream.factory.learning.chapter2;

/*
page 43, fridge exercise 2. there are x parts of code that are scrambled up and i need to sort them to make a working java program...
i can put as many curly braces as i want (because some are missing), the program needs to print out "bang bang da-bang" ln "ding ding da-ding"
 */
public class DrumKitTestDrive {

    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.playTopHat();
        d.snare=false;

        if (d.snare == true) {
            d.playSnare();
        }
    }

}

class DrumKit {

    boolean topHat = true;
    boolean snare = true;

    void playSnare() {
        System.out.println("bang bang da-bang");
    }

    void playTopHat () {
        System.out.println("ding ding da-ding");
    }

}