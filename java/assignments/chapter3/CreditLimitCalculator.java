import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number (or -1 to quit): ");
        int accountNumber = input.nextInt();

        while (accountNumber != -1) {
            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();
            
            System.out.print("Enter total charges this month: ");
            int totalCharges = input.nextInt();
            
            System.out.print("Enter total credits this month: ");
            int totalCredits = input.nextInt();
            
            System.out.print("Enter allowed credit limit: ");
            int creditLimit = input.nextInt();
            
            // Calculate new balance
            int newBalance = beginningBalance + totalCharges - totalCredits;
            
            System.out.printf("New balance for account %d is %d%n", accountNumber, newBalance);
            
            // Check if credit limit is exceeded
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            }
            
            System.out.println(); // Blank line for spacing
            System.out.print("Enter account number (or -1 to quit): ");
            accountNumber = input.nextInt();
        }
        
        input.close();
    }
}