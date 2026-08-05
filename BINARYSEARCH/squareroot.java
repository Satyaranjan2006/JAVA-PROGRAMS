package BINARYSEARCH;

import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        // 3. Read a full line of text (String)
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();


        int ans = squareRoot(n);
        System.out.println(ans);
    }

    public static int squareRoot(int n) {
        if (n <2) {
            return n;
        }
        int start = 1;
        int end = n;
        int ans = 0;
        while (start <= end) {
            int mid = (start+end) / 2;
            if (mid*mid<=n) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
