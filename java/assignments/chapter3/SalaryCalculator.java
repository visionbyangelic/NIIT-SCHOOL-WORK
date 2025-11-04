import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int counter = 0;
        
        while (counter < 3) {
            System.out.printf("Enter details for employee %d%n", counter + 1);
            
            System.out.print("Enter hours worked: ");
            double hours = input.nextDouble();
            
            System.out.print("Enter hourly rate: ");
            double rate = input.nextDouble();
            
            double grossPay;
            
            // Calculate gross pay
            if (hours <= 40) {
                grossPay = hours * rate; // Straight time
            } else {
                double basePay = 40 * rate;
                double overtimeHours = hours - 40;
                double overtimePay = overtimeHours * rate * 1.5; // Time and a half
                grossPay = basePay + overtimePay;
            }
            
            System.out.printf("Employee %d's gross pay is $%.2f%n%n", (counter + 1), grossPay);
            
            counter = counter + 1;
        }
        
        input.close();
    }
}