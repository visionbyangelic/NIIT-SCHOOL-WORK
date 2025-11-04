public class Checkerboard {
    public static void main(String[] args) {
        int row = 1; // Start at row 1
        
        while (row <= 8) {
            // If it's an even-numbered row, print a leading space
            if (row % 2 == 0) {
                System.out.print(" ");
            }
            
            int col = 1;
            while (col <= 8) {
                System.out.print("* ");
                col = col + 1;
            }
            
            System.out.println(); // Move to the next line
            row = row + 1;
        }
    }
}