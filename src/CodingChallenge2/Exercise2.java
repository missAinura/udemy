package CodingChallenge2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Restaurant Bill Calculator\n");

        System.out.println("What is your bill total? : $");
        double bill = scanner.nextDouble();

        System.out.println("How many people?");
        int people = scanner.nextInt();

        double  eachPay = bill / people;

        System.out.format("A bill of $%.2f split between " + people + "" +
                "people comes to approximately $%.2f each", bill, eachPay);








    }
}
