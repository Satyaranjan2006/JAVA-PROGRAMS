class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0){
            return new long[]{};
        }
        long r=(num/3);
        return new long[]{r-1,r,r+1};
    }
}

//c++ sloution

class Solution {
public:
    vector<long long> sumOfThree(long long num) 
    {
        vector<long long>ans;
        long long n = num / 3;
        for(long long i = n; i<n+2 ;i++)
        {
            if((i-1) + (i) + (i+1) == num) 
            {
                ans.push_back(i-1);
                ans.push_back(i);
                ans.push_back(i+1);
            }
        }
        return ans;
    }
};