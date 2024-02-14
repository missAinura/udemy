package CodingChallenge3;

public class Exercise2 {

    public static void main(String[] args) {
//print the difference btn 2 ints
        int x = 91;
        int y = 75;

        if(x > y){
            System.out.println("x is bigger than y by " + (x -y));
        }
        else if (x < y){
            System.out.println("x is smaller than y by " + (y -x));
        }else
            System.out.println("x and y are the same");


    }
}
