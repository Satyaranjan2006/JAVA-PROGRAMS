class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        // int sum=0;
        // // if(n==1 && nums[0]==0){
        // //     return false;
        // // }
        // if(n==1){
        //     return false;
        // }

        // for(int i=0;i<n;i++){
        //     sum=nums[i];
        //     for(int j=i+1;j<n;j++){
        //         sum+=nums[j];

        //         if(sum%k==0 ){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int reminder=0;
        int diff=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];

            reminder=sum%k;

            if(map.containsKey(reminder)){
                diff=i-map.get(reminder);

                if(diff>=2){
                    return true;
                }
            }else{
                //if not 
            map.put(reminder,i);
            }
            


        }
        return false;
        
    }
}

//c++ solution


class Solution {
public:
    bool checkSubarraySum(vector<int>& nums, int k) 
    {
        map<int, int> rem;
        rem[0] = -1;

        int sum = 0, n = nums.size();

        for(int i = 0; i < n; i++)
        {
            sum += nums[i];
            int x = sum % k;

            if(rem.find(x) != rem.end())
            {
                if(i - rem[x] >= 2)
                    return true;
            }
            else
                rem[x] = i;
        }

        return false;
    }
};