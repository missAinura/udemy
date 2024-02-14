package string;

import java.util.Scanner;

public class StringEquiality {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("The VIP Lounge");

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have a VIP pass? yes/no: ");
        String vipPassReply = scanner.next();

        if(age >= 18 || vipPassReply.equals("yes") || age >=70){
            System.out.println("Thanks, go on in");
        }
        else {
            System.out.println("Sorry, can do");
        }
















    }
}
