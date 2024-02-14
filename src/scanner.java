import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.next();
        System.out.println(userName +  " is a nice name");

        System.out.println("HOw old are you?");
        int userAge = scanner.nextInt();
        System.out.println("Your name is " + userName + " and you are  " + userAge + " years old");

        System.out.println("\nHow tall are you in meters?");
        double userHeight = scanner.nextDouble();
        System.out.println(" You are " + userHeight + " metres tall");

        double averageMaleHeightDifference = userHeight - 1.75;
        double averageFemaleHeightDifference = userHeight - 1.62;
        System.out.println("\nThe difference between your height and the average is:");
        System.out.format("%.2fm if you are male.\n", averageMaleHeightDifference);
        System.out.format("%.2fm if you are female", averageFemaleHeightDifference );










    }
}
