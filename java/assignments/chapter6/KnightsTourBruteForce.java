import java.security.SecureRandom;

public class KnightsTourBruteForce{
    private static final int SIZE = 8;
    private static int[][] board = new int[SIZE][SIZE];
    private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static final SecureRandom random = new SecureRandom();
    
    public static void main(String[] args) {
        // Part a: Single random tour
        System.out.println("Single Random Tour:");
        int moves = attemptRandomTour();
        printBoard();
        System.out.println("Moves completed: " + moves);
        
        // Part b: 1000 tours
        System.out.println("\n1000 Random Tours:");
        int[] tourLengths = new int[65]; // 0 to 64 moves
        for (int i = 0; i < 1000; i++) {
            resetBoard();
            int length = attemptRandomTour();
            tourLengths[length]++;
        }
        
        // Display results
        System.out.println("Tour Length\tFrequency");
        for (int i = 2; i <= 64; i++) {
            if (tourLengths[i] > 0) {
                System.out.printf("%d\t\t%d%n", i, tourLengths[i]);
            }
        }
        
        // Part c: Run until full tour
        System.out.println("\nFinding first full tour...");
        int attempts = 0;
        while (true) {
            resetBoard();
            int length = attemptRandomTour();
            attempts++;
            if (length == 64) {
                System.out.println("Full tour found after " + attempts + " attempts!");
                printBoard();
                break;
            }
            if (attempts % 10000 == 0) {
                System.out.println("Attempts so far: " + attempts);
            }
        }
    }
    
    private static int attemptRandomTour() {
        int currentRow = random.nextInt(SIZE);
        int currentCol = random.nextInt(SIZE);
        int moveCount = 1;
        board[currentRow][currentCol] = moveCount;
        
        while (moveCount < 64) {
            int[] possibleMoves = new int[8];
            int count = 0;
            
            // Find all possible moves
            for (int i = 0; i < 8; i++) {
                int nextRow = currentRow + vertical[i];
                int nextCol = currentCol + horizontal[i];
                if (isValidMove(nextRow, nextCol) && board[nextRow][nextCol] == 0) {
                    possibleMoves[count++] = i;
                }
            }
            
            if (count == 0) break; // No more moves
            
            // Choose random move
            int move = possibleMoves[random.nextInt(count)];
            currentRow += vertical[move];
            currentCol += horizontal[move];
            board[currentRow][currentCol] = ++moveCount;
        }
        
        return moveCount;
    }
    
    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE;
    }
    
    private static void resetBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = 0;
            }
        }
    }
    
    private static void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%3d", board[i][j]);
            }
            System.out.println();
        }
    }
}