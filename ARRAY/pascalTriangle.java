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


// c++ solution

#include <bits/stdc++.h>
using namespace std;

class Solution {
private:
    // Returns one value from Pascal's Triangle.
    int valueAt(int row, int col) {
        // Boundary values are always 1.
        if (col == 0 || col == row) {
            return 1;
        }

        // Add the two values directly above the current cell.
        return valueAt(row - 1, col - 1) + valueAt(row - 1, col);
    }

public:
    // Returns the first numRows rows of Pascal's Triangle.
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> triangle;

        // Build every requested row from top to bottom.
        for (int row = 0; row < numRows; row++) {
            vector<int> current;

            // Compute every cell in this row independently.
            for (int col = 0; col <= row; col++) {
                current.push_back(valueAt(row, col));
            }

            triangle.push_back(current);
        }

        return triangle;
    }
};

// Prints a triangle in list form.
void printTriangle(const vector<vector<int>>& triangle) {
    cout << "[";

    int rowCount = triangle.size();

    // Print each row in order.
    for (int row = 0; row < rowCount; row++) {
        cout << "[";

        int colCount = triangle[row].size();

        // Print every value in the current row.
        for (int col = 0; col < colCount; col++) {
            cout << triangle[row][col];

            // Add a separator between values in the same row.
            if (col + 1 < colCount) {
                cout << ", ";
            }
        }

        cout << "]";

        // Add a separator between completed rows.
        if (row + 1 < rowCount) {
            cout << ", ";
        }
    }

    cout << "]\n";
}

// Driver code
int main() {
    int numRows = 6;

    // instance for class Solution
    Solution sol;

    vector<vector<int>> answer = sol.generate(numRows);
    printTriangle(answer);

    return 0;
}