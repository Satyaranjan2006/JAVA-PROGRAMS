package LINEARSEARCH;

public class fintTheMinimum {
    public static void main(String[] args) {
        int arr[] = { 771, 23, 4, 95, 67, 890, 44, 67, 71 };

        System.out.println(min(arr));
    }

    static int min(int arr[]) {// recieving array
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {//chek if i th index value is less than vallue of firdt index
                ans = arr[i];
                return ans;
            }
        }
        return ans;
    }
}
