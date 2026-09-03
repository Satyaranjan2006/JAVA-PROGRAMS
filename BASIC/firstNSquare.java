package BASIC;

import java.util.Scanner;

public class firstNSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number for finding the sum of its square root");

        int n=sc.nextInt();

        if(n<0){
            System.out.println("The number you entered is not valid");

        }
        double result=n*(n+1)*(2*n+1)/6;

        System.out.println("Sum of N cube is  "+ result);
    }
}
