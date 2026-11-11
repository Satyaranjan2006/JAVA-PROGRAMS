class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board)
            Arrays.fill(row, '.');
        int[] leftRow = new int[n];
        int[] lowerDiagonal = new int[2 * n - 1];
        int[] upperDiagonal = new int[2 * n - 1];
        solve(0, board, n, leftRow, upperDiagonal, lowerDiagonal, res);
        return res;
    }

    //Function to solve N-Queens
    public void solve(int col, char[][] board, int n, int[] leftRow, int[] upperDiagonal, int[] lowerDiagonal,
            List<List<String>> res) {
        //if all queens are placed
        if (col == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            res.add(temp);
            return;
        }
        //through rowss
        for (int row = 0; row < n; row++) {
            //check safety
            if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[n - 1 + col - row] == 0) {
                //place the queen
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[n - 1 + col - row] = 1;
                //recure

                solve(col + 1, board, n, leftRow, upperDiagonal, lowerDiagonal, res);

                //back to base babe

                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[n - 1 + col - row] = 0;
            }
        }
    }
}

//c++ solution
class Solution {
private: 
    // Helper function to check if placing a queen at position (row,col) is safe
    bool isSafePlace(int n, vector<string>& nQueens, int row, int col) {
        // Check if there's any queen in the same column above current position
        for(int i=0; i<n; i++) {
            if(nQueens[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal for any queen
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(nQueens[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal for any queen
        for(int i=row-1, j=col+1; i>=0 && j<n; i--, j++) {
            if(nQueens[i][j] == 'Q') {
                return false;
            }
        }

        // If no conflicts found, position is safe
        return true;
    }

    // Recursive helper function to solve N-Queens problem
    void solveNQueens(int n, vector<vector<string>>& output, vector<string>& nQueens, int row) {
        // Base case: if we've placed queens in all rows, we found a valid solution
        if(row == n) {
            output.push_back(nQueens);
            return;
        }

        // Try placing queen in each column of current row
        for(int col=0; col<n; col++) {
            // If current position is safe
            if(isSafePlace(n, nQueens, row, col)) {
                // Place queen
                nQueens[row][col] = 'Q';
                // Recursively solve for next row
                solveNQueens(n, output, nQueens, row+1);
                // Backtrack: remove queen for trying next position
                nQueens[row][col] = '.';
            }
        }
    }

public:
    // Main function to solve N-Queens problem
    vector<vector<string>> solveNQueens(int n) {
        vector<vector<string>> output;  // Stores all valid solutions
        vector<string> nQueens(n, string(n, '.')); // Initialize empty board
        solveNQueens(n, output, nQueens, 0); // Start solving from row 0
        return output;
    }
};