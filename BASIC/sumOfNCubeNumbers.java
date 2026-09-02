package BASIC;
import java.util.Scanner;

public class sumOfNCubeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number for finding the sum of its cube root");

        int n=sc.nextInt();

        if(n<0){
            System.out.println("The number you entered is not valid");

        }
        double result=Math.pow(n*(n+1)/2,2);

        System.out.println("Sum of N cube is  "+ result);
    }
}
