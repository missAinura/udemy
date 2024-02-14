package CodingChallenge2;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("First name: ");
        String firstName = scanner.next();

        System.out.println("Age ");
        int age = scanner.nextInt();

        System.out.println("Amount of money in your pocket: $");
        double money = scanner.nextDouble();

        System.out.println();
        double moneyNeeded = Math.ceil(money) - money;

        System.out.println("Your name is  " +firstName + " an you are " + age + " years old" + "charachters long");
        System.out.format(" You have $%.2f on you and need $%.2f", money, moneyNeeded);
    }
}
