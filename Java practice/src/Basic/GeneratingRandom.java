package Basic;

import java.util.Random;

public class GeneratingRandom {
    public static void main(String[] args) {
        Random rand = new Random();
       int rand1= rand.nextInt(999);
        System.out.println("random value is - "+ rand1);

    }
}
