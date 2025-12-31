import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] sales = new double[5][4]; // 5 products, 4 salespeople
        
        System.out.println("Enter sales data (salesperson product amount), -1 to end:");
        
        while (true) {
            System.out.print("Enter salesperson (1-4), product (1-5), amount: ");
            int salesperson = input.nextInt();
            if (salesperson == -1) break;
            
            int product = input.nextInt();
            if (product == -1) break;
            
            double amount = input.nextDouble();
            if (amount == -1) break;
            
            sales[product - 1][salesperson - 1] += amount;
        }
        
        // Display results
        System.out.println("\nTotal Sales Report");
        System.out.println("Product\\Salesperson\t1\t2\t3\t4\tTotal");
        
        double[] productTotals = new double[5];
        double[] salespersonTotals = new double[4];
        double grandTotal = 0;
        
        for (int product = 0; product < 5; product++) {
            System.out.printf("Product %d\t\t", product + 1);
            double productTotal = 0;
            
            for (int salesperson = 0; salesperson < 4; salesperson++) {
                System.out.printf("%.2f\t", sales[product][salesperson]);
                productTotal += sales[product][salesperson];
                salespersonTotals[salesperson] += sales[product][salesperson];
            }
            
            System.out.printf("%.2f%n", productTotal);
            productTotals[product] = productTotal;
            grandTotal += productTotal;
        }
        
        // Display salesperson totals
        System.out.print("Salesperson Total\t");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%.2f\t", salespersonTotals[i]);
        }
        System.out.printf("%.2f%n", grandTotal);
    }
}