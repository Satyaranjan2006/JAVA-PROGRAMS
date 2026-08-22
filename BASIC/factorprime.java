package BASIC;

import java.util.Scanner;

public class factorprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the integer fro finding its prime factor");
        int number=sc.nextInt();

         // Loop through potential factors starting from 2
        for (int i = 2; i <= number; i++) { 
            // Divide the number by i as long as it's perfectly divisible
            while (number % i == 0) { 
                System.out.print(i + " "); 
                number = number / i; // Reduce the number
            } 
        } 
    }
}
