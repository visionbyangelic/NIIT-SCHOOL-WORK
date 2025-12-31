import java.security.SecureRandom;

public class KnightsTourClosed{
    private static final int SIZE = 8;
    private static int[][] board = new int[SIZE][SIZE];
    private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static final SecureRandom random = new SecureRandom();
    private static int startRow, startCol;
    
    public static void main(String[] args) {
        int closedTours = 0;
        int totalTours = 0;
        
        System.out.println("Testing for closed tours...");
        
        while (totalTours < 100) { // Test 100 tours
            if (attemptTour()) {
                totalTours++;
                if (isClosedTour()) {
                    closedTours++;
                    System.out.println("Closed tour found! Tour #" + totalTours);
                    printBoard();
                }
            }
        }
        
        System.out.printf("Found %d closed tours out of %d total tours (%.1f%%)%n",
                         closedTours, totalTours, (closedTours * 100.0 / totalTours));
    }
    
    private static boolean attemptTour() {
        resetBoard();
        startRow = random.nextInt(SIZE);
        startCol = random.nextInt(SIZE);
        int currentRow = startRow;
        int currentCol = startCol;
        int moveCount = 1;
        board[currentRow][currentCol] = moveCount;
        
        while (moveCount < 64) {
            int[] possibleMoves = new int[8];
            int count = 0;
            
            // Find all possible moves using accessibility heuristic
            for (int i = 0; i < 8; i++) {
                int nextRow = currentRow + vertical[i];
                int nextCol = currentCol + horizontal[i];
                if (isValidMove(nextRow, nextCol) && board[nextRow][nextCol] == 0) {
                    possibleMoves[count++] = i;
                }
            }
            
            if (count == 0) return false; // No complete tour
            
            // Choose move with minimum accessibility
            int bestMove = findBestMove(currentRow, currentCol, possibleMoves, count);
            currentRow += vertical[bestMove];
            currentCol += horizontal[bestMove];
            board[currentRow][currentCol] = ++moveCount;
        }
        
        return true; // Complete tour
    }
    
    private static int findBestMove(int currentRow, int currentCol, int[] moves, int count) {
        int[][] accessibility = {
            {2, 3, 4, 4, 4, 4, 3, 2},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {2, 3, 4, 4, 4, 4, 3, 2}
        };
        
        int minAccess = Integer.MAX_VALUE;
        int bestMove = moves[0];
        
        for (int i = 0; i < count; i++) {
            int move = moves[i];
            int nextRow = currentRow + vertical[move];
            int nextCol = currentCol + horizontal[move];
            
            // Update accessibility for current board state
            int access = accessibility[nextRow][nextCol];
            for (int j = 0; j < 8; j++) {
                int testRow = nextRow + vertical[j];
                int testCol = nextCol + horizontal[j];
                if (isValidMove(testRow, testCol) && board[testRow][testCol] > 0) {
                    access--;
                }
            }
            
            if (access < minAccess) {
                minAccess = access;
                bestMove = move;
            }
        }
        
        return bestMove;
    }
    
    private static boolean isClosedTour() {
        int lastRow = -1, lastCol = -1;
        
        // Find the last move (64)
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 64) {
                    lastRow = i;
                    lastCol = j;
                    break;
                }
            }
        }
        
        // Check if last move is one knight move away from start
        for (int i = 0; i < 8; i++) {
            if (lastRow + vertical[i] == startRow && lastCol + horizontal[i] == startCol) {
                return true;
            }
        }
        
        return false;
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