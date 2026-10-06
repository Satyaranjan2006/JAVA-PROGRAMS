package Recursion;

import java.util.Scanner;

public class fibonacciRecursion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        
        int n=sc.nextInt();

        int first=0;
        int second=1;
        System.out.print(first+" "+second+" ");
        fibo(n-2,first,second);
    }
    public static void fibo(int n,int first,int second){
        
        if(n==0){
            return;
         }
          int third=first+second;
        System.out.print(third+" ");
        fibo(n-1,second,third);
    }
}

// Enter number
// 10
// 0 1 1 2 3 5 8 13 21 34 