package tut15;

public class findPivot {
    public static void main(String[] args) {
        int [] arr={5,6,7,0,1,2};
       int ans= findpivot(arr); 
       System.out.println(ans);

    }
    static  int  findpivot(int []arr){
         int start=0;
         int end=arr.length-1;
         //ffirst check kariba whether array is sorted or not
            if(arr[start]<=arr[end]){
                return 0;
            }
         while (start<=end) {
            int mid=start+(end-start)/2;
            
            //check for mid and mid+1 element
            if(arr[mid]>arr[mid+1]){
                return (mid+1);
            }
            else if(arr[start]<=arr[mid]){
                start=mid+1;

            }else{
                end=mid-1;
            }
         }
         return -1;

}
}
