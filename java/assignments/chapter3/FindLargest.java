import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int counter = 1;
        int number;
        int largest;
        
        // Input the first number to initialize 'largest'
        System.out.print("Enter integer 1: ");
        largest = input.nextInt();
        
        // Loop for the remaining 9 numbers
        while (counter < 10) {
            counter = counter + 1; // Increment counter
            
            System.out.printf("Enter integer %d: ", counter);
            number = input.nextInt();
            
            // If the new number is larger, update largest
            if (number > largest) {
                largest = number;
            }
        }
        
        System.out.printf("%nLargest integer is: %d%n", largest);
        input.close();
    }
}