package Recursion;

public class pow_x {
     public static int power(int x, int n) {
        // Base case: any number to the power of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive call: x * x^(n-1)
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(x + " to the power of " + n + " is: " + power(x, n)); 
        // Output: 32
    }
}
