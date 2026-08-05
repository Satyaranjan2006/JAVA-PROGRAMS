package LINEARSEARCH;

//LINERAR SEARCH TO TARGET NUMBER
public class main {
    public static void main(String[] args) {

    

    // TAKE AN ARRAY
    int[] arr = { 1, 23, 4, 5, 67, 890, 44, 67, 71 };
    int target = 67;
    int ans = searching(arr, target);
    System.out.println(ans);
    }

    static int searching(int[] nums, int target) {
        if(nums.length==0){
            return-1;
        }
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];  //storing index values in element 
            if (element == target) {//comparing
                return i;
            }
        }
        return -1;//if any return statement doesnot execute yhe it will execute
    }
}
