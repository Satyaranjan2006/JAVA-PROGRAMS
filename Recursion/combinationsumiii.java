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