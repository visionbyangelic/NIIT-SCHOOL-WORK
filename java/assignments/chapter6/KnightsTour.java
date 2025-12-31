public class KnightsTour{
    private static final int SIZE = 8;
    private static int[][] board = new int[SIZE][SIZE];
    private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    
    public static void main(String[] args) {
        // Initialize accessibility heuristic
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
        
        int currentRow = 0, currentCol = 0;
        int moveNumber = 0;
        
        // Start tour
        for (int move = 1; move <= 64; move++) {
            board[currentRow][currentCol] = move;
            
            // Update accessibility
            for (int i = 0; i < 8; i++) {
                int testRow = currentRow + vertical[i];
                int testCol = currentCol + horizontal[i];
                if (isValidMove(testRow, testCol) && board[testRow][testCol] == 0) {
                    accessibility[testRow][testCol]--;
                }
            }
            
            // Find next move with minimum accessibility
            int minAccess = Integer.MAX_VALUE;
            int bestMove = -1;
            
            for (int i = 0; i < 8; i++) {
                int testRow = currentRow + vertical[i];
                int testCol = currentCol + horizontal[i];
                
                if (isValidMove(testRow, testCol) && board[testRow][testCol] == 0) {
                    if (accessibility[testRow][testCol] < minAccess) {
                        minAccess = accessibility[testRow][testCol];
                        bestMove = i;
                    }
                }
            }
            
            if (bestMove == -1) {
                System.out.println("Tour ended after " + move + " moves");
                break;
            }
            
            currentRow += vertical[bestMove];
            currentCol += horizontal[bestMove];
            moveNumber++;
        }
        
        printBoard();
    }
    
    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE;
    }
    
    private static void printBoard() {
        System.out.println("Knights Tour:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%3d", board[i][j]);
            }
            System.out.println();
        }
    }
}