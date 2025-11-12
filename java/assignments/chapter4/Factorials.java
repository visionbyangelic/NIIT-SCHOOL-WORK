public class Factorials{
    public static void main(String[] args){
        System.out.printf("%-5s%-20s%n", "n", "n!");
        System.out.println("-------------------");
        
        for (int n = 1; n <= 20; n++){
            long factorial = 1;
            for (int i = 1; i <= n; i++){
                factorial *= i;
            }
            System.out.printf("%-5d%-20d%n", n, factorial);
        }
        
        System.out.println("\nDifficulty for calculating 100!: ");
        System.out.println("The factorial of 100 is extremely large (approximately 9.33×10^157)");
        System.out.println("which exceeds the maximum value of long type in Java.");
    }
}