package BINARYSEARCH;

//introduction to binary search.search the element and return its index
public class main {
    public static void main(String[] args) {
        int[] arr = { 12, 4, 55, 66, 75, 79, 45, 33 };     //ascending order search
        // int target = 709;//the target is absent in array
         int target = 79;//the target is present at index number 5
        int ans = binarySearch(arr, target);
        if(ans==-1){
            System.out.println("terget is absent in the array");
        }else{
            System.out.println("the target is present at index number "+ans);
        }
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;// provides end index

        while (start <= end) {
            int mid = start + (end - start) / 2;// it providesthe middle element
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

}
