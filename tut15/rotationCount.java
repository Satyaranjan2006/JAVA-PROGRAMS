package tut15;

//find the rotation count in the rotated sorted array
public class rotationCount {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6,7, 7, 0, 1, 2 };
        int ans=countrotations(arr);
        System.out.println("array is rotated "+ans+"times");
    }

    static int countrotations(int[] arr) {
        int pivot = findpivot(arr);

        return pivot;

    }

    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        // ffirst check kariba whether array is sorted or not
        if (arr[start] <= arr[end]) {
            return 0;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // check for mid and mid+1 element
            if (arr[mid] > arr[mid + 1]) {
                return (mid + 1);
            } else if (arr[start] <= arr[mid]) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return 0;

    }
}
