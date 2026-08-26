package BASIC;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseNumber {
    // Function to reverse the number without using recursion
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        try {
            
            System.out.println("Enter a number");
            n = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("An error occurred");
            return;
        }
        int rev,i,s;


        rev = 0;
        for(i=n; i!=0; i/=10){
            rev= rev*10+(i%10);
        }
        System.out.println("The reverse is " + rev);
    }
}