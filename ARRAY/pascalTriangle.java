import java.util.ArrayList;
import java.util.List;

class Solution {
    // Returns one value from Pascal's Triangle.
    private int valueAt(int row, int col) {
        // Boundary values are always 1.
        if (col == 0 || col == row) {
            return 1;
        }

        // Add the two values directly above the current cell.
        return valueAt(row - 1, col - 1) + valueAt(row - 1, col);
    }

    // Returns the first numRows rows of Pascal's Triangle.
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Build every requested row from top to bottom.
        for (int row = 0; row < numRows; row++) {
            List<Integer> current = new ArrayList<>();

            // Compute every cell in this row independently.
            for (int col = 0; col <= row; col++) {
                current.add(valueAt(row, col));
            }

            triangle.add(current);
        }

        return triangle;
    }
}

// Driver code
class Main {
    public static void main(String[] args) {
        int numRows = 6;

        // instance for class Solution
        Solution sol = new Solution();

        System.out.println(sol.generate(numRows));
    }
}