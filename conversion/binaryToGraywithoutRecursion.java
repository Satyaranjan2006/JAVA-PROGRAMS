package conversion;

import java.util.Scanner;

public class binaryToGraywithoutRecursion {
     public static void main(String[] args) 
    {
        int a, b, x, result = 0, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Binary number:");
        x = s.nextInt();
        while(x != 0)
        {
            a = x % 10;
            x = x / 10;
            b = x % 10;
            if((a & ~ b) == 1 || (~ a & b) == 1)
            {
                result = (int) (result + pow(10,i));
            }
            i++;
        }
        System.out.println("Gray Code:"+result);
}
