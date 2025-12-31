import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        
        // Using int
        System.out.printf("Fibonacci(%d) using int: %d%n", n, fibonacciInt(n));
        
        // Using double
        System.out.printf("Fibonacci(%d) using double: %.0f%n", n, fibonacciDouble(n));
        
        // Find largest Fibonacci numbers
        findLargestFibonacci();
    }
    
    public static int fibonacciInt(int n) {
        if (n <= 1) return n;
        
        int prev2 = 0;
        int prev1 = 1;
        
        for (int i = 2; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        
        return prev1;
    }
    
    public static double fibonacciDouble(int n) {
        if (n <= 1) return n;
        
        double prev2 = 0;
        double prev1 = 1;
        
        for (int i = 2; i <= n; i++) {
            double current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        
        return prev1;
    }
    
    public static void findLargestFibonacci() {
        System.out.println("\nFinding largest Fibonacci numbers:");
        
        // Using int
        int n = 0;
        int fibInt = 0;
        int prev2 = 0, prev1 = 1;
        
        while (prev1 > 0) { // Check for overflow
            fibInt = prev1;
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
            n++;
        }
        
        System.out.printf("Largest Fibonacci number (int): Fibonacci(%d) = %d%n", n, fibInt);
        
        // Using double
        n = 0;
        double fibDouble = 0;
        double dPrev2 = 0, dPrev1 = 1;
        
        while (!Double.isInfinite(dPrev1)) {
            fibDouble = dPrev1;
            double current = dPrev1 + dPrev2;
            dPrev2 = dPrev1;
            dPrev1 = current;
            n++;
        }
        
        System.out.printf("Largest Fibonacci number (double): Fibonacci(%d) = %.0f%n", n, fibDouble);
    }
}