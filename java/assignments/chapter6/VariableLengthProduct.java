public class VariableLengthProduct{
    public static void main(String[] args) {
        System.out.printf("Product of 1, 2, 3: %d%n", product(1, 2, 3));
        System.out.printf("Product of 2, 4, 6, 8: %d%n", product(2, 4, 6, 8));
        System.out.printf("Product of 5: %d%n", product(5));
        System.out.printf("Product of 10, 20, 30, 40, 50: %d%n", product(10, 20, 30, 40, 50));
    }
    
    public static int product(int... numbers) {
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        return product;
    }
}