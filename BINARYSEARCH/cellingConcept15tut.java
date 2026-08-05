package BINARYSEARCH;

public class cellingConcept15tut {
    public static void main(String[] args) {
        int[] arr = { 2,3,5,9,14,16,18 };     //ascending order search
        // int target = 709;//the target is absent in array
         int target = 25;
        int ans = celling(arr, target);
        System.out.println(ans);
    }

    static int celling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;// provides end index
        if(target>arr[arr.length-1])
            return -1;

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
        return start;
    }
}
