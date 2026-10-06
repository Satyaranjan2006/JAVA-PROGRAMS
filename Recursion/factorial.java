package Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        int n = sc.nextInt();

        int sum = factorial(n);
        System.out.println(sum);
    }

    public static int factorial(int n) {

        if (n == 1)
            return n;

        return n * factorial(n - 1);

    }
}
