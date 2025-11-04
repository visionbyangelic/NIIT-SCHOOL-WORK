import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double grossSales = 0.0;
        
        System.out.println("Enter item number sold (1-4, or -1 to finish):");
        System.out.println("Item 1: $239.99");
        System.out.println("Item 2: $129.75");
        System.out.println("Item 3: $99.95");
        System.out.println("Item 4: $350.89");
        
        System.out.print("Enter item number (-1 to quit): ");
        int itemNumber = input.nextInt();
        
        while (itemNumber != -1) {
            switch (itemNumber) {
                case 1:
                    grossSales += 239.99;
                    break;
                case 2:
                    grossSales += 129.75;
                    break;
                case 3:
                    grossSales += 99.95;
                    break;
                case 4:
                    grossSales += 350.89;
                    break;
                default:
                    System.out.println("Invalid item number. Please enter 1-4.");
                    break;
            }
            
            System.out.print("Enter item number (-1 to quit): ");
            itemNumber = input.nextInt();
        }
        
        // Calculate earnings
        double commission = 0.09 * grossSales;
        double earnings = 200.00 + commission;
        
        System.out.printf("%nTotal gross sales: $%.2f%n", grossSales);
        System.out.printf("Total earnings: $%.2f%n", earnings);
        
        input.close();
    }
}
