import java.util.Scanner;

public class ProductCalculator{
    public static void main(String[] args){
        // Calculate the product of three integers
        Scanner input = new Scanner(System.in);

        int x, y, z, result;

        System.out.print("Enter first integer: ");
        x = input.nextInt();

        System.out.print("Enter second integer: ");
        y = input.nextInt();

        System.out.print("Enter third integer: ");
        z = input.nextInt();

        result = x * y * z;

        System.out.printf("Product is %d%n", result);
    }
}