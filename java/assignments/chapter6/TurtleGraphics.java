import java.util.Scanner;

public class TurtleGraphics{
    private static final int SIZE = 20;
    private static int[][] floor = new int[SIZE][SIZE];
    private static int x = 0, y = 0; // Current position
    private static boolean penDown = false;
    private static int direction = 0; // 0=right, 1=down, 2=left, 3=up
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Turtle Graphics Commands:");
        System.out.println("1 - Pen up");
        System.out.println("2 - Pen down");
        System.out.println("3 - Turn right");
        System.out.println("4 - Turn left");
        System.out.println("5,10 - Move forward 10 spaces");
        System.out.println("6 - Display the floor");
        System.out.println("9 - End of data");
        
        while (true) {
            System.out.print("Enter command: ");
            int command = input.nextInt();
            
            switch (command) {
                case 1: // Pen up
                    penDown = false;
                    break;
                    
                case 2: // Pen down
                    penDown = true;
                    break;
                    
                case 3: // Turn right
                    direction = (direction + 1) % 4;
                    break;
                    
                case 4: // Turn left
                    direction = (direction + 3) % 4;
                    break;
                    
                case 5: // Move forward
                    int spaces = input.nextInt();
                    move(spaces);
                    break;
                    
                case 6: // Display floor
                    displayFloor();
                    break;
                    
                case 9: // End
                    return;
                    
                default:
                    System.out.println("Invalid command");
            }
        }
    }
    
    private static void move(int spaces) {
        for (int i = 0; i < spaces; i++) {
            // Calculate new position
            int newX = x, newY = y;
            
            switch (direction) {
                case 0: newY++; break; // Right
                case 1: newX++; break; // Down
                case 2: newY--; break; // Left
                case 3: newX--; break; // Up
            }
            
            // Check bounds
            if (newX < 0 || newX >= SIZE || newY < 0 || newY >= SIZE) {
                System.out.println("Cannot move outside floor boundaries");
                return;
            }
            
            // Update position
            x = newX;
            y = newY;
            
            // Mark position if pen is down
            if (penDown) {
                floor[x][y] = 1;
            }
        }
    }
    
    private static void displayFloor() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (floor[i][j] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}