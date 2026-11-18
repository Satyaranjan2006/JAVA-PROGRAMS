class Solution {
    public int reversePairs(int[] nums) {
        int ans = 0;
        List<Long> res = new ArrayList<>();
        res.add((long) nums[nums.length - 1] * 2);

        for (int i = nums.length - 2; i >= 0; i--) {
            ans += LessThanx(res, nums[i]);
            update(res, (long) nums[i] * 2);
        }

        return ans;
    }

    private int LessThanx(List<Long> res, long val) {
        if (res.get(0) >= val) {
            return 0;
        }

        if (res.get(res.size() - 1) < val) {
            return res.size();
        }

        int lo = 0, hi = res.size() - 1;

        while (lo < hi) {
            int mid = (lo + hi) / 2;

            if (res.get(mid) < val) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        return lo;
    }

    private void update(List<Long> res, long val) {
        int index = Collections.binarySearch(res, val);
        if (index < 0) {
            index = -(index + 1);
        }
        res.add(index, val);
    }
}
//c++ solution

 class Solution {
    
public:
    void merge(vector<int>&nums,int low,int mid,int high){
        vector<int>temp;
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp.push_back(nums[left]);
                left++;
            }
            else{
                temp.push_back(nums[right]);
                right++;
            }

        }
        while(left<=mid){
            temp.push_back(nums[left]);
            left++;
        }
        while(right<=high){
            temp.push_back(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            nums[i]=temp[i-low];
        }
    }
    int countPairs(vector<int>&nums,int low,int mid,int high){
        int count=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while( (right<=high) && ((long long)nums[i]>(2LL)*nums[right])) right++;
            count+=(right-(mid+1));
        }
        return count;
    }
    int  mergesort(vector<int>&nums,int low,int high){
        int count=0;
        if(low>=high) return 0;
        int mid=low+(high-low)/2;
        count+= mergesort(nums,low,mid);
        count+= mergesort(nums,mid+1,high);
        count += countPairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return count;
    } 
    int reversePairs(vector<int>& nums) {
        int n=nums.size();
          return mergesort(nums,0,n-1);
  }
};