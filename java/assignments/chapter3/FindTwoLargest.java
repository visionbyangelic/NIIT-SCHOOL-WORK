import java.util.Scanner;

public class FindTwoLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int largest;
        int secondLargest;
        
        // Input first number
        System.out.print("Enter integer 1: ");
        int number = input.nextInt();
        largest = number;
        
        // Input second number
        System.out.print("Enter integer 2: ");
        number = input.nextInt();
        
        // Compare first two numbers to set largest and secondLargest
        if (number > largest) {
            secondLargest = largest;
            largest = number;
        } else {
            secondLargest = number;
        }
        
        int counter = 3; // Start counter at 3
        
        // Loop for the remaining 8 numbers
        while (counter <= 10) {
            System.out.printf("Enter integer %d: ", counter);
            number = input.nextInt();
            
            if (number > largest) {
                secondLargest = largest; // Old largest is now second largest
                largest = number;       // New number is largest
            } else if (number > secondLargest) {
                secondLargest = number; // New number is second largest
            }
            
            counter = counter + 1;
        }
        
        System.out.printf("%nLargest integer is: %d%n", largest);
        System.out.printf("Second largest integer is: %d%n", secondLargest);
        
        input.close();
    }
}