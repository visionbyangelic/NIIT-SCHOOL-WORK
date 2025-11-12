import java.util.Scanner;

public class CountNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        if (num1 < 0) negativeCount++;
        else if (num1 > 0) positiveCount++;
        else zeroCount++;

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        if (num2 < 0) negativeCount++;
        else if (num2 > 0) positiveCount++;
        else zeroCount++;

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        if (num3 < 0) negativeCount++;
        else if (num3 > 0) positiveCount++;
        else zeroCount++;

        System.out.print("Enter fourth number: ");
        int num4 = input.nextInt();
        if (num4 < 0) negativeCount++;
        else if (num4 > 0) positiveCount++;
        else zeroCount++;

        System.out.print("Enter fifth number: ");
        int num5 = input.nextInt();
        if (num5 < 0) negativeCount++;
        else if (num5 > 0) positiveCount++;
        else zeroCount++;

        System.out.printf("Negative numbers: %d%n", negativeCount);
        System.out.printf("Positive numbers: %d%n", positiveCount);
        System.out.printf("Zero numbers: %d%n", zeroCount);
    }
}