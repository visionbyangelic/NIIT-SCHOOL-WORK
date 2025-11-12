import java.util.Scanner;

public class Multiples{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int first = input.nextInt();
        System.out.print("Enter second integer: ");
        int second = input.nextInt();

        if (first % second == 0) {
            System.out.printf("%d is a multiple of %d%n", first, second);
        } else {
            System.out.printf("%d is not a multiple of %d%n", first, second);
        }
    }
}