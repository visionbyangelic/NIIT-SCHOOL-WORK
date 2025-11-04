//Write a Java code to accept infinite number from the user and display the count 
//of negative and positive number displayed by the use , sentinel value should be -1

import java.util.Scanner;

public class sentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int positiveCount = 0;
        int negativeCount = 0;

        System.out.println("Enter numbers (enter -1 to stop):");

        while (true) {
            number = input.nextInt();

            if (number == -1) { // sentinel value
                break;
            }

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }
        }

        System.out.println("Total positive numbers: " + positiveCount);
        System.out.println("Total negative numbers: " + negativeCount);
    }
}