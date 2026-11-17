class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0){
            return new long[]{};
        }
        long r=(num/3);
        return new long[]{r-1,r,r+1};
    }
}