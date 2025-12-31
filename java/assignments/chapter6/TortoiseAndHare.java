import java.security.SecureRandom;

public class TortoiseAndHare{
    private static final int RACE_LENGTH = 70;
    private static int tortoisePos = 1;
    private static int harePos = 1;
    private static final SecureRandom random = new SecureRandom();
    
    public static void main(String[] args) {
        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");
        
        while (tortoisePos < RACE_LENGTH && harePos < RACE_LENGTH) {
            moveTortoise();
            moveHare();
            displayRace();
            
            if (tortoisePos >= RACE_LENGTH && harePos >= RACE_LENGTH) {
                System.out.println("It's a tie!");
            } else if (tortoisePos >= RACE_LENGTH) {
                System.out.println("TORTOISE WINS!!! YAY!!!");
            } else if (harePos >= RACE_LENGTH) {
                System.out.println("Hare wins. Yuch.");
            }
            
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    private static void moveTortoise() {
        int move = 1 + random.nextInt(10);
        
        if (move <= 5) { // Fast plod
            tortoisePos += 3;
        } else if (move <= 7) { // Slip
            tortoisePos -= 6;
        } else { // Slow plod
            tortoisePos += 1;
        }
        
        if (tortoisePos < 1) tortoisePos = 1;
        if (tortoisePos > RACE_LENGTH) tortoisePos = RACE_LENGTH;
    }
    
    private static void moveHare() {
        int move = 1 + random.nextInt(10);
        
        if (move <= 2) { // Sleep
            // No move
        } else if (move <= 4) { // Big hop
            harePos += 9;
        } else if (move <= 5) { // Big slip
            harePos -= 12;
        } else if (move <= 8) { // Small hop
            harePos += 1;
        } else { // Small slip
            harePos -= 2;
        }
        
        if (harePos < 1) harePos = 1;
        if (harePos > RACE_LENGTH) harePos = RACE_LENGTH;
    }
    
    private static void displayRace() {
        for (int i = 1; i <= RACE_LENGTH; i++) {
            if (i == tortoisePos && i == harePos) {
                System.out.print("OUCH!!!");
            } else if (i == tortoisePos) {
                System.out.print("T");
            } else if (i == harePos) {
                System.out.print("H");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}