/**
 * Given an integer array nums, which can have duplicate entries, provide the power set.

Duplicate subsets cannot exist in the solution set. Return the answer in any sequence.
 * Solution
 */
class Solution {
    ArrayList<List<Integer>>ans=new ArrayList<>();

    public void solve(int i,int []nums,ArrayList<Integer>temp){
        if(i==nums.length){
           if(check(ans,temp)){
            ans.add(new ArrayList<>(temp));
           }
            return;
        }

        temp.add(nums[i]);
        solve(i+1,nums,temp);
        temp.remove(temp.size()-1);
        solve(i+1,nums,temp);
    }
    public boolean check(ArrayList<List<Integer>>ans,ArrayList<Integer>temp){
        boolean isequal=true;
        if(ans.size()==0){return true;}
        for(int i=0;i<ans.size();i++){
             isequal = ans.get(i).equals(temp);
            if(isequal){
                return false;
            }
        }
        return !isequal;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //your code goes here
        ArrayList<Integer>temp=new ArrayList<>();
        solve(0,nums,temp);
        return ans;
    }
}