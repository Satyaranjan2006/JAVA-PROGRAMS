public class Solution {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean solve(char[][] board) {

        // Find an empty cell
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {

                    // Try every digit from 1 to 9
                    for (char ch = '1'; ch <= '9'; ch++) {

                        if (isValid(board, i, j, ch)) {

                            // Place the digit
                            board[i][j] = ch;

                            // Recursively solve the remaining board
                            if (solve(board)) {
                                return true;
                            }

                            // Backtrack if the choice doesn't work
                            board[i][j] = '.';
                        }
                    }

                    // No digit can solve this cell
                    return false;
                }
            }
        }

        // No empty cells left, so the board is solved
        return true;
    }

    public boolean isValid(char[][] board, int row, int col, char ch) {

        for (int i = 0; i < 9; i++) {

            // Check row
            if (board[row][i] == ch) {
                return false;
            }

            // Check column
            if (board[i][col] == ch) {
                return false;
            }

            // Check 3x3 box
            int r = 3 * (row / 3) + i / 3;
            int c = 3 * (col / 3) + i % 3;

            if (board[r][c] == ch) {
                return false;
            }
        }

        return true;
    }
} {
    
}
//c++ solution

class Solution {
public:
    bool isSafe(vector<vector<char>>& board, int row, int col, int digit)
    {
        for (int j = 0; j < 9; j++)
        {
            if (board[row][j] == digit)
            {
                return false;
            }
        }
        for (int j = 0; j < 9; j++)
        {
            if (board[j][col] == digit)
            {
                return false;
            }
        }
        int srow = (row / 3) * 3;
        int scol = (col / 3) * 3;
        for (int i = srow; i <= srow + 2; i++)
        {
            for (int j = scol; j <= scol + 2; j++)
            {
                if (board[i][j] == digit)
                {
                    return false;
                }
            }
        }
        return true;
    }

    bool helper(vector<vector<char>>& board, int row, int col)
    {
        if (row == 9)
        {
            return true;
        }
        int nextRow = row;
        int nextCol = col + 1;

        if (nextCol == 9)
        {
            nextRow = row + 1;
            nextCol = 0;
        }
        if (board[row][col] != '.')
        {
            return helper(board, nextRow, nextCol);
        }

        for (char i = '1'; i <= '9'; i++)
        {
            if (isSafe(board, row, col, i))
            {
                board[row][col] = i;
                if (helper(board, nextRow, nextCol))
                {
                    return true;
                }
            }
            board[row][col] = '.';
        }
        return false;
    }

    void solveSudoku(vector<vector<char>>& board) 
    {
        helper(board, 0, 0);
    }
};