//JAVA SOLUTION
class Solution {
    ArrayList<List<Integer>> result=new ArrayList<>();

    public void solve(int [] nums,int i,List<Integer>temp){
        if(i>=nums.length){
            result.add(new ArrayList<>(temp));
            return;

        }
        temp.add(nums[i]);
        solve(nums,i+1,temp);
        temp.remove(temp.size()-1);
        solve(nums,i+1,temp);
    }

       
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> temp=new ArrayList<>();
        solve(nums,0,temp);
        return result;
    }
    
}


//c++ code

class Solution {
public:
    void SubSetsRec(vector<int>& nums, int index,
                    vector<int>& singleSubset,
                    vector<vector<int>>& subsets) {
        if (index == nums.size()) {
            subsets.push_back(singleSubset);
            return;
        }

        // notPick
        SubSetsRec(nums, index + 1, singleSubset, subsets);

        // pick
        singleSubset.push_back(nums[index]);
        SubSetsRec(nums, index + 1, singleSubset, subsets);
        singleSubset.pop_back();
    }

    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> subsets;
        vector<int> singleSubset;

        SubSetsRec(nums, 0, singleSubset, subsets);
        return subsets;
    }
};