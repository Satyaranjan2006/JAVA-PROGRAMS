class Solution {
    public int maxTurbulenceSize(int[] arr) {
        char prev = 0;
        int left = 0;
        int result = 1;
        for (int right = 1; right < arr.length; ++right) {
            if (arr[right - 1] < arr[right] && prev != '<') {
                prev = '<';
                result = Math.max(result, right - left + 1);
            } else if (arr[right - 1] > arr[right] && prev != '>') {
                prev = '>';
                result = Math.max(result, right - left + 1);
            } else {
                prev = 0;
                right -= arr[right - 1] == arr[right] ? 0 : 1;
                left = right;
            }
        }
        return result;
    }
}


// c++ solution

class Solution {
public:
    int maxTurbulenceSize(vector<int>& nums) {
        int n = nums.size();
        int len = 1, best = 1;
        int prev = 0; // 1 = up (<), -1 = down (>), 0 = none/equal

        for (int i = 1; i < n; i++) {
            int cur = 0;
            if (nums[i-1] < nums[i]) cur = 1;
            else if (nums[i-1] > nums[i]) cur = -1;

            if (cur == 0) {
                // Equal elements break turbulence
                len = 1;
            } else if (prev == 0 || cur == prev) {
                // Start of a new turbulent subarray of length 2
                len = 2;
            } else {
                // Signs alternate, extend the current subarray
                len++;
            }

            prev = cur;
            best = max(best, len);
        }

        return best;
    }
};