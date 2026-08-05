package BINARYSEARCH;

import java.util.Scanner;

public class nthroot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        // 3. Read a full line of text (String)
        System.out.print("Enter  number N: ");
        int N = scanner.nextInt();
        System.out.print("Enter  number M: ");
        int M = scanner.nextInt();

        System.out.println(nthRoot(N, M));
    }
    public static int nthRoot(int N, int M) {
        int low = 1;
        int high = M;
        
        while (low <= high) {
            int ans=1;
            int mid = (low + high) / 2;
            for(int i=1; i<=N; i++) {
                ans *= mid;
            }
            if (ans == M) {
                return mid;
            } else if (ans > M) {
                high = mid - 1;
            } else {
                 low = mid + 1;
               
            }
        }
        return -1; // Return the largest integer whose M-th power is less than or equal to N
    }
}
