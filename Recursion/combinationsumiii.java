// Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

// Only numbers 1 through 9 are used.
// Each number is used at most once.
// Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.

class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        combi(1,k,n,new ArrayList<>(),0);
        return list;
    }
    public void combi(int val,int k,int n,List<Integer> curr,int sum){
        if(sum==n && curr.size()==k){
            list.add(new ArrayList<>(curr));
            return;
        }
        if(val >9 || sum>n || curr.size()>k){
            return;
        }
        curr.add(val);
        combi(val+1,k,n,curr,sum+val);
        curr.remove(curr.size()-1);
        combi(val+1,k,n,curr,sum);
    }
}


//c++ solution

class Solution {
public:
    void Perform(int ind, int target, vector<int>& nums, vector<vector<int>>& ans, vector<int>& temp, int n, int limit, int curr_limit, int sum){
        // Base case: Valid combination found
        if(target == sum && curr_limit == limit) {
            ans.push_back(temp);
            return;
        }
        
        // Base case: Reached the end of the numbers array
        if(n == ind) return;

        // Choice 1: Include current element (if it doesn't exceed target)
        if((nums[ind] + sum) <= target){
            temp.push_back(nums[ind]);
            Perform(ind + 1, target, nums, ans, temp, n, limit, curr_limit + 1, sum + nums[ind]);
            temp.pop_back(); // Backtrack
        }
        
        // Choice 2: Exclude current element
        Perform(ind + 1, target, nums, ans, temp, n, limit, curr_limit, sum);
    }

    vector<vector<int>> combinationSum3(int limit, int target) {
        vector<int> nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
 
        vector<vector<int>> ans;
        vector<int> temp;

        // Start recursion from index 0 with n = 9 elements
        Perform(0, target, nums, ans, temp, 9, limit, 0, 0);

        return ans;
    }
};