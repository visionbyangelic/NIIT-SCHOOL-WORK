import java.util.Scanner;

public class SmallestValue{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of integers: ");
        int count = input.nextInt();
        
        if (count <= 0){
            System.out.println("Invalid number of values.");
            return;
        }
        
        System.out.print("Enter integer 1: ");
        int smallest = input.nextInt();
        
        for (int i = 2; i <= count; i++){
            System.out.printf("Enter integer %d: ", i);
            int current = input.nextInt();
            if (current < smallest) {
                smallest = current;
            }
        }
        
        System.out.printf("The smallest value is: %d%n", smallest);
    }
}