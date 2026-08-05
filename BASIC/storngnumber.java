
package BASIC;

import java.util.Scanner;
//write  aprogram to check whether the number is storng number  or not
//storng number:--addition of factorial of each digit is equal
public class storngnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive number ");
        
        int number=sc.nextInt();

        if(number<0){
            System.out.println("enter positive number");
        }
        if(isStorng(number)){
            System.out.println("number is armstorng");

        }else{
            System.out.println("number is not armstorng number");
        }


    }

    public static boolean isStorng(int number){
        int original=number;
        int sum=0;
        while(number>0){
        int divisor=number%10;
         sum+=factorial(divisor);
        number=number/10;
       }
       return sum == original;
    }

    public  static long factorial(int divisior){
        int fact=1;
        for(int i=2;i<=divisior;i++){
            fact=fact*i;
        }
        return fact;

    }
}
