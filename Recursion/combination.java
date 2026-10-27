class Solution {

    private void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind + 1, arr, target, ans, ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}


//Approach 2

class Solution {
    List<List<Integer>>result=new ArrayList<>();

    public void findCombination(int ind,int [] arr,int target,List<Integer>temp){
        if(ind==arr.length){
            if(target==0){
                result.add(new ArrayList<>(temp));
            }
            return;
        }

        if(arr[ind]<=target){
            temp.add(arr[ind]);
            findCombination(ind,arr,target-arr[ind],temp);
            temp.remove(temp.size()-1);
        }
        findCombination(ind+1,arr,target,temp);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //your code goes here
        ArrayList<Integer> temp=new ArrayList<>();
        findCombination(0,candidates,target,temp);
        return result;
    }
}