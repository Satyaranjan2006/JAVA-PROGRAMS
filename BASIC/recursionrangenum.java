package BASIC;
import java.util.*;
import java.util.Scanner;

public class recursionrangenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter upper limit");

        int upper=sc.nextInt();

        printno(upper);
    }

    public static void printno(int upper){
        if(upper>0){
            printno(upper-1);
            System.out.println(upper);
        }
    }
}
