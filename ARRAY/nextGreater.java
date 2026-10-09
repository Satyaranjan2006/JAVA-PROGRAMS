package ARRAY;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class nextGreater {
     static void printNextGreatest(int[] array){
        Stack<Integer> stack=new Stack<>();
        stack.push(array[0]);
        int i,x;
        for(i=1;i<array.length;i++){
            if(stack.empty()){
                stack.push(array[i]);
                continue;
            }
            while (!stack.empty() && stack.peek()<array[i]){
               x=stack.peek();
               System.out.println(x+"---->"+array[i]);
               stack.pop();
            }
            stack.push(array[i]);
        }
        while(!stack.empty()){
            System.out.println(stack.pop()+"---->"+-1);
        }
    }
    // Main method to read the array
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size;
        System.out.println("Enter the size of the array");
        try {
            size = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("Invalid Input");
            return;
        }
        int[] array = new int[size];
        System.out.println("Enter array elements");
        int i;
        for (i = 0; i < array.length; i++) {
            try {
                array[i] = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("Invalid element. Enter it again");
                i--;
            }
        }
        printNextGreatest(array);
    }
}
