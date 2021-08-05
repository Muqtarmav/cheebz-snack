package chapterFour;
import java.util.Scanner;
public class Factor {
     public static void main (String [] args){
        int num1;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        num1 = input.nextInt();

        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println("THIS IS THE FACTOR");
    }
}



