package BASIC;

public class PeakIndexInMarr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
      int large=Integer.MIN_VALUE; 
      int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
                ans=i;
            }
        } 
        return ans;
    }
        
}
