import java.util.Scanner;

public class FairTaxCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String[] categories = {
            "housing", "food", "clothing", "transportation", 
            "education", "health care", "vacations"
        };
        
        double totalExpenses = 0;
        
        System.out.println("FairTax Calculator");
        System.out.println("Enter your annual expenses in each category:\n");
        
        for (String category : categories) {
            System.out.printf("Enter %s expenses: $", category);
            double expense = input.nextDouble();
            totalExpenses += expense;
        }
        
        double fairTax = totalExpenses * 0.23;
        double equivalentRate = 0.23 / (1 - 0.23) * 100;
        
        System.out.printf("%nTotal expenses: $%.2f%n", totalExpenses);
        System.out.printf("Estimated FairTax (23%%): $%.2f%n", fairTax);
        System.out.printf("Note: This is equivalent to a %.1f%% income tax rate%n", equivalentRate);
    }
}