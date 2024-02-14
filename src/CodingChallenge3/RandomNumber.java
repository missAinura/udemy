package CodingChallenge3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1,6);

        System.out.println("Random here: " + randomNumber);





    }

}
