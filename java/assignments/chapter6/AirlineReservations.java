import java.util.Scanner;

public class AirlineReservations{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] seats = new boolean[10]; // false = available, true = occupied
        
        while (true) {
            System.out.print("Please type 1 for First Class, 2 for Economy (0 to exit): ");
            int choice = input.nextInt();
            
            if (choice == 0) {
                break;
            }
            
            if (choice == 1) {
                // First Class (seats 1-5)
                boolean assigned = false;
                for (int i = 0; i < 5; i++) {
                    if (!seats[i]) {
                        seats[i] = true;
                        System.out.printf("Boarding Pass: First Class, Seat %d%n", i + 1);
                        assigned = true;
                        break;
                    }
                }
                
                if (!assigned) {
                    System.out.print("First Class is full. Would you like Economy? (1 for yes, 0 for no): ");
                    int response = input.nextInt();
                    if (response == 1) {
                        choice = 2; // Switch to economy
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                        continue;
                    }
                }
            }
            
            if (choice == 2) {
                // Economy (seats 6-10)
                boolean assigned = false;
                for (int i = 5; i < 10; i++) {
                    if (!seats[i]) {
                        seats[i] = true;
                        System.out.printf("Boarding Pass: Economy, Seat %d%n", i + 1);
                        assigned = true;
                        break;
                    }
                }
                
                if (!assigned) {
                    System.out.print("Economy is full. Would you like First Class? (1 for yes, 0 for no): ");
                    int response = input.nextInt();
                    if (response == 1) {
                        choice = 1; // Switch to first class
                        // Try first class again
                        for (int i = 0; i < 5; i++) {
                            if (!seats[i]) {
                                seats[i] = true;
                                System.out.printf("Boarding Pass: First Class, Seat %d%n", i + 1);
                                assigned = true;
                                break;
                            }
                        }
                    }
                    
                    if (!assigned) {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                }
            }
            
            // Display available seats
            System.out.print("Available seats: ");
            for (int i = 0; i < seats.length; i++) {
                if (!seats[i]) {
                    System.out.print((i + 1) + " ");
                }
            }
            System.out.println();
        }
    }
}