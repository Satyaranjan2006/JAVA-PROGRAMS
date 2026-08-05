package tut16.binarysrc2dARRy;

public class rowcolmatrix {
    public static void main(String[] args) {
        int matrix[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int target=77;
        int[] ans=search(matrix,target);
        System.out.println("Target found at: "+ans[0]+", "+ans[1]);
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;
        while(r<matrix.length&&c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            else if(matrix[r][c]>target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
