import java.util.Scanner;

public class Encryptor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a four-digit integer: ");
        int number = input.nextInt();
        
        // Isolate each digit
        int d1 = number / 1000;
        int d2 = (number % 1000) / 100;
        int d3 = (number % 100) / 10;
        int d4 = number % 10;
        
        // Encrypt each digit
        int ed1 = (d1 + 7) % 10;
        int ed2 = (d2 + 7) % 10;
        int ed3 = (d3 + 7) % 10;
        int ed4 = (d4 + 7) % 10;
        
        // Swap 1st with 3rd, and 2nd with 4th (Note: we use the encrypted digits)
        // The encrypted digits are now ed3, ed4, ed1, ed2
        
        System.out.printf("Encrypted integer is: %d%d%d%d%n", ed3, ed4, ed1, ed2);
        
        input.close();
    }
}