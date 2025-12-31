import java.security.SecureRandom;

public class EightQueensBruteForce{
    private static final int SIZE = 8;
    private static final SecureRandom random = new SecureRandom();
    
    public static void main(String[] args) {
        System.out.println("Eight Queens - Brute Force Approaches");
        
        // Part a: Random brute force
        System.out.println("\n1. Random Brute Force:");
        randomBruteForce();
        
        // Part b: Exhaustive search would be too slow (8^8 = 16,777,216 possibilities)
        // So we'll demonstrate with a smaller example
        System.out.println("\n2. Exhaustive Search (demonstration):");
        exhaustiveSearch(4); // 4-queens problem for demonstration
    }
    
    private static void randomBruteForce() {
        int attempts = 0;
        final int MAX_ATTEMPTS = 100000;
        
        while (attempts < MAX_ATTEMPTS) {
            int[] queens = generateRandomPlacement();
            attempts++;
            
            if (isValidSolution(queens)) {
                System.out.println("Solution found after " + attempts + " attempts:");
                printBoard(queens);
                return;
            }
        }
        
        System.out.println("No solution found in " + MAX_ATTEMPTS + " attempts.");
    }
    
    private static void exhaustiveSearch(int n) {
        System.out.println("Exhaustive search for " + n + "-queens problem:");
        int[] queens = new int[n];
        int solutions = exhaustiveSearch(queens, 0);
        System.out.println("Total solutions found: " + solutions);
    }
    
    private static int exhaustiveSearch(int[] queens, int col) {
        if (col >= queens.length) {
            if (isValidSolution(queens)) {
                printBoard(queens);
                return 1;
            }
            return 0;
        }
        
        int count = 0;
        for (int row = 0; row < queens.length; row++) {
            queens[col] = row;
            if (isSafe(queens, col)) {
                count += exhaustiveSearch(queens, col + 1);
            }
        }
        return count;
    }
    
    private static int[] generateRandomPlacement() {
        int[] queens = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            queens[i] = random.nextInt(SIZE);
        }
        return queens;
    }
    
    private static boolean isValidSolution(int[] queens) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = i + 1; j < SIZE; j++) {
                // Check same row
                if (queens[i] == queens[j]) {
                    return false;
                }
                // Check diagonals
                if (Math.abs(queens[i] - queens[j]) == Math.abs(i - j)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private static boolean isSafe(int[] queens, int col) {
        for (int i = 0; i < col; i++) {
            // Check same row or diagonal
            if (queens[i] == queens[col] || 
                Math.abs(queens[i] - queens[col]) == Math.abs(i - col)) {
                return false;
            }
        }
        return true;
    }
    
    private static void printBoard(int[] queens) {
        for (int i = 0; i < queens.length; i++) {
            for (int j = 0; j < queens.length; j++) {
                if (queens[j] == i) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}