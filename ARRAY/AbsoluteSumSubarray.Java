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