package chapterFour;

import java.util.Scanner;

public class SalesContest {
    public static void main(String[] args) {
        int largest = 0;
        int secondLargest = 0;


        Scanner input = new Scanner(System.in);

        for (int count = 0; count <10 ; count++) {
            System.out.println("Enter unit sold price / no repetition is allowed! " + (count + 1) + ": ");
            int value = input.nextInt();
            if (value > largest) {
                secondLargest = largest;
                largest = value;

            } else {
                if (value > secondLargest) ;
                {
                    secondLargest = value;
                }

            }


        }

        System.out.println("this is the largest number" + largest);
        System.out.println("this is the second largest number" + secondLargest);

    }
}






