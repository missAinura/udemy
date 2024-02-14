package CodingChallenge3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise3 {

    public static void main(String[] args) {
        /*
        create a game wher the progream pics a random number from 1 to 5
        and the player has to guess
         */

       // int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        System.out.println("I'm thinking of a number from 1 to 5. Try to guess it.");
        System.out.print("Your guess: ");
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        if (guess == randomNumber) {
            System.out.println("Correct! Aren't you lucky.");
        }
        else {
            System.out.println("Hard luck! Maybe next time.");


        }
    }
}
