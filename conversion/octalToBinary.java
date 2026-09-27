package conversion;

import java.util.Scanner;

public class octalToBinary {
    public static void main(String args[]) 
	{
		Octal_Binary obj = new Octal_Binary();
		obj.getVal();
		obj.convert();
	}


    class Octal_Binary 
{
	Scanner scan;
	int num;
	void getVal() 
	{
		System.out.println("Octal to Binary");
		scan = new Scanner(System.in);
 
		System.out.println("\nEnter the number :");
		num = Integer.parseInt(scan.nextLine(), 8);
	}
 
	void convert() 
	{
		String binary = Integer.toBinaryString(num);
		System.out.println("Binary Value is : " + binary);
	}
}
}
