class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
    //    int i=0;
    //    for(int j=1;j<nums.length;j++){
    //     if(nums[i]!=nums[j]){
    //         i++;
    //         nums[i]=nums[j];
    //     }
    //    } 
    //    return i+1;//to get number of sortedarray number

    
    LinkedHashSet<Integer> set = new LinkedHashSet<>();
    int element=0;
    for(int i=0;i<n;i++){
        if(set.contains(nums[i])){
            continue;
        }else{
            set.add(nums[i]);
        }
    }
    //here we load all data into the array now.
    // we will return the length of the array.

    int length=set.size();
    int j=0;

    while(!set.isEmpty()){
        element=set.stream().findFirst().get();
        nums[j]=element;
        j++;
        set.remove(element);
    }
    return length;
    }
}