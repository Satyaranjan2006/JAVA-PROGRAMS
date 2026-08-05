package BINARYSEARCH;

//here we do not know thT WHETHER THE ARRAY  IS SORDED IN ASCENDING ORDER AO DESCENDING ORDER
public class orderAgnostic {
    public static void main(String[] args) {
        // int[] arr = {  93,12, 14, 55, 66, 75, 79, 85, };
        int[] arr={93,67,65,62,45,29,22,12};
        int target = 45;
        int ans = orderAgnosticBSH(arr, target);
       if(ans==-1){
        System.out.println("data is absent");
       }
       else{
        System.out.println("data is present at index number"+ ans);
       }
    }

    static int orderAgnosticBSH(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        // 1stcheck whether the array is ascending or not
        boolean isAsc = arr[start] < arr[end];
       

        while (start <= end) {
                int mid = start + (end - start) / 2;// it providesthe middle element
                if (target ==arr[mid]) {
                    return mid;

                } 
                if(isAsc){
                 if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }}
                else{
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }

            }
            return -1;

        

    }

}
