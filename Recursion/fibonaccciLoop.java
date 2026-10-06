package Recursion;

import java.util.Scanner;

public class fibonaccciLoop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        
        int n=sc.nextInt();

        int first=0;
        int second=1;
        int third=0;
        System.out.print(first+" "+second+" ");

        for(int i=1;i<=n-2;i++){
            third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }

    }
}
