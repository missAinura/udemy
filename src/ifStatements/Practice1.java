package ifStatements;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to SuperFast Rollercoaster!");
        System.out.print("Please enter your height in centimetres: "); //will be on 1 line
        int height = scanner.nextInt();

        if(height < 130 || height > 210){
            System.out.println("Sorry, you don't meet the requirements.");

        }

        else {
            System.out.println("Height accepted. Go ahead");
        }










    }

}
