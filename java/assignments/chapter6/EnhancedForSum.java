public class EnhancedForSum{
    public static void main(String[] args) {
        double sum = 0.0;
        
        for (String arg : args) {
            try {
                sum += Double.parseDouble(arg);
            } catch (NumberFormatException e) {
                System.out.printf("Warning: '%s' is not a valid number.%n", arg);
            }
        }
        
        System.out.printf("Sum of command-line arguments: %.2f%n", sum);
    }
}