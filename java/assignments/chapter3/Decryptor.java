import java.util.Scanner;

public class Decryptor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter encrypted four-digit integer: ");
        int encryptedNumber = input.nextInt();
        
        // Isolate encrypted digits
        int ed3 = encryptedNumber / 1000;
        int ed4 = (encryptedNumber % 1000) / 100;
        int ed1 = (encryptedNumber % 100) / 10;
        int ed2 = encryptedNumber % 10;
        
        // Decrypt each digit (reverse of (d + 7) % 10 is (ed + 3) % 10)
        int d1 = (ed1 + 3) % 10;
        int d2 = (ed2 + 3) % 10;
        int d3 = (ed3 + 3) % 10;
        int d4 = (ed4 + 3) % 10;
        
        // Digits are already in original order d1, d2, d3, d4
        System.out.printf("Decrypted integer is: %d%d%d%d%n", d1, d2, d3, d4);
        
        input.close();
    }
}