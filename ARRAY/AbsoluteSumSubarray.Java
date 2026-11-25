class Solution {
    public int maxAbsoluteSum(int[] nums) {
        if (nums.length == 1) {
            return Math.abs(nums[0]);
        }

        int maxSum = nums[0];
        int minSum = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxSum = Math.max(maxSum + nums[i], nums[i]);
            minSum = Math.min(minSum + nums[i], nums[i]);
            ans = Math.max(Math.abs(ans), Math.max(Math.abs(maxSum), Math.abs(minSum)));
        }

        return ans;
    }
}

//c++ code

class Solution {
public:
    int maxAbsoluteSum(vector<int>&ver) {
        // note abs(x) means +- x which means max value of x and min value of x 
        int currmaxsum=ver[0];
        int maxsum=ver[0];
        int currminsum=ver[0];
        int minsum=ver[0];
        int totalsum=ver[0];
        for(int i=1;i<ver.size();i++){
            currmaxsum=max(currmaxsum+ver[i],ver[i]);
            maxsum=max(maxsum,currmaxsum);
            currminsum=min(currminsum+ver[i],ver[i]);
            minsum=min(minsum,currminsum);
        }
        return max(abs(minsum),abs(maxsum));
    }
};