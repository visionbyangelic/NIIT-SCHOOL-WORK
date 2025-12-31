public class EightQueens{
    private static final int SIZE = 8;
    private static int[] queens = new int[SIZE]; // queens[col] = row
    
    public static void main(String[] args) {
        System.out.println("Solving Eight Queens Problem...");
        
        if (solve(0)) {
            printBoard();
        } else {
            System.out.println("No solution found.");
        }
    }
    
    private static boolean solve(int col) {
        if (col >= SIZE) {
            return true; // All queens placed
        }
        
        for (int row = 0; row < SIZE; row++) {
            if (isSafe(row, col)) {
                queens[col] = row;
                
                if (solve(col + 1)) {
                    return true;
                }
                
                // Backtrack
                queens[col] = 0;
            }
        }
        
        return false;
    }
    
    private static boolean isSafe(int row, int col) {
        // Check same row
        for (int i = 0; i < col; i++) {
            if (queens[i] == row) {
                return false;
            }
        }
        
        // Check upper diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (queens[j] == i) {
                return false;
            }
        }
        
        // Check lower diagonal
        for (int i = row + 1, j = col - 1; i < SIZE && j >= 0; i++, j--) {
            if (queens[j] == i) {
                return false;
            }
        }
        
        return true;
    }
    
    private static void printBoard() {
        System.out.println("Eight Queens Solution:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (queens[j] == i) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}