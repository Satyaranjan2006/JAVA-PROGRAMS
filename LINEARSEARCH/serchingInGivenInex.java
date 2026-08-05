package LINEARSEARCH;
//search the array in the give index .here {1,4}
public class serchingInGivenInex {
    public static void main(String[] args) {
        int arr[]={1, 23, 4, 5, 67, 890, 44, 67, 71};
        int target=5;
        System.out.println(searching(arr,target,1,4));
    }
    static int searching(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i < end; i++) {
            if(target==arr[i]){
                return 1;
            }
        }
        return -1;
    }
}
