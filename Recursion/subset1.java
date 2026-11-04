//java solution

// Given an array nums of n integers. Return array of sum of all subsets of the array nums.

// Output can be returned in any order.
class Solution {
    ArrayList<Integer>ans=new ArrayList<>();

    public void solve(int i,int []nums,ArrayList<Integer>temp){
        if(i==nums.length){
            ans.add(add(temp));
            return;
        }

        temp.add(nums[i]);
        solve(i+1,nums,temp);
        temp.remove(temp.size()-1);
        solve(i+1,nums,temp);
    }
    public int add(ArrayList<Integer>temp){
        int sum=0;
        int size=temp.size();
        if(size==0){
            return 0;
        }
        for(int i=0;i<size;i++){
            sum+=temp.get(i);
        }
        return sum;
    }
    public List<Integer> subsetSums(int[] nums) {
        //your code goes here
        ArrayList<Integer>temp=new ArrayList<>();
        solve(0,nums,temp);
        return ans;
    }
}