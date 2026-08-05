package tut15;

public class infiniteARRAY15 {
    public static void main(String[] args) {
int arr[]={2,3,5,6,7,8,10,11,12,15,20,23,30,31};
int target=15;
int answer=ans(arr,target);

System.out.println("the number is present at in index number"+answer);

    }

    // this function will provide a refinedbox of arrayb to binarySearch()
    static int ans(int[] arr, int target) {
        // targeting the first start
        // FIRST START WITH ABOX OF SIZE 2

        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newstart = end + 1;// temoprary update
            // end=end+previousSize*2;
            end = end + (end - start + 1) * 2;
            start=newstart;

        }
              return  binarySearch( arr, target, start,  end) ;       

    }

    static int binarySearch(int[] arr, int target, int start, int end) {

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
