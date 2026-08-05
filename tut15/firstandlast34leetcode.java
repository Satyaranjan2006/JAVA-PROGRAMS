package tut15;

public class firstandlast34leetcode {
    public static void main(String[] args) {
        
    }

    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
       ans[0]=start;
       ans[1]=end;
       return ans;
        
    }
  int search(int[] nums ,int target,boolean findStartIndex){
    int ans=-1;
    int start = 0;
        int end = nums.length - 1;// provides end index

        while (start <= end) {
            int mid = start + (end - start) / 2;// it providesthe middle element
            if (target < nums[mid]) {
                end = mid - 1;

            } else if (target >nums[mid]) {
                start = mid + 1;
            } else {
               ans=mid;
               if(findStartIndex){
                end=mid-1;
               }else{
                start=mid+1;
               }
            }

        }
        return ans;

  }
        
    
}
