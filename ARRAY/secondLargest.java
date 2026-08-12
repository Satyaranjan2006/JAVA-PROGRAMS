package ARRAY;
import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //first enter the number of element.
        //then according to number of element ask for elements
        //then run a function for getting the second largest element
        System.out.println("Enter the number of element");

        int num=sc.nextInt();

        int arr[]=new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("enter element of "+i);
            //i want to push the element in the array
            arr[i]=sc.nextInt();

        }

        int second_num=findSecondLargest(arr);
        System.err.println("second largest element is"+second_num);

    }

    public static int findSecondLargest(int arr[]){
        int n=arr.length;
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }


        return secondLargest;
    }
}
