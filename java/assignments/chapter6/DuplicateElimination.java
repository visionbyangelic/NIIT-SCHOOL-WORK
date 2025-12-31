import java.util.Scanner;

public class DuplicateElimination{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int count = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number between 10 and 100: ");
            int num = input.nextInt();
            
            // Validate input
            while (num < 10 || num > 100) {
                System.out.print("Invalid input. Enter a number between 10 and 100: ");
                num = input.nextInt();
            }
            
            // Check for duplicates
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (numbers[j] == num) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate) {
                numbers[count] = num;
                count++;
                System.out.print("Unique values: ");
                for (int k = 0; k < count; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            } else {
                System.out.println("Duplicate number. Not added.");
            }
        }
    }
}