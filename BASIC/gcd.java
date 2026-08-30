package BASIC;

import java.util.Scanner;

public class gcd {
    public static void main(String args[])
    {
        int a, b, hcf = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Number:");
        a = s.nextInt();
        System.out.print("Enter Second Number:");
        b = s.nextInt();
        int n = Math.min(a,b);
        for(int i = 2; i < n; i++)
        {
            while(a % i == 0 && b % i==0)
            {
                hcf = hcf * i;
                a = a / i;
                b = b / i;
            }
        }
        System.out.println("Greatest Common Divisor:"+hcf);
    }
}
