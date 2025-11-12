import java.util.Scanner;

public class LargestSmallest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();
        System.out.print("Enter fourth integer: ");
        int num4 = input.nextInt();
        System.out.print("Enter fifth integer: ");
        int num5 = input.nextInt();

        int largest = num1;
        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;
        if (num4 > largest) largest = num4;
        if (num5 > largest) largest = num5;

        int smallest = num1;
        if (num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;
        if (num4 < smallest) smallest = num4;
        if (num5 < smallest) smallest = num5;

        System.out.printf("Largest integer is: %d%n", largest);
        System.out.printf("Smallest integer is: %d%n", smallest);
    }
}