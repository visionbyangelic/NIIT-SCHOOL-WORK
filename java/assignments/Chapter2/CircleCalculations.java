import java.util.Scanner;

public class CircleCalculations{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius as an integer: ");
        int radius = input.nextInt();

        System.out.printf("Diameter is: %d%n", (2 * radius));
        System.out.printf("Circumference is: %f%n", (2 * Math.PI * radius));
        System.out.printf("Area is: %f%n", (Math.PI * radius * radius));
    }
}