import java.util.Arrays;

public class BinarySearchMatrix {
    public static void main(String[] args) {
        int[][] arr = { {1,25,37},
                        {42,51,61},
                        {710,888,999}
                                };
        int target =888;
        int ans[] = searchMatrix(arr, target);
        System.out.println(Arrays.toString(ans));

    }


    // Binary search in 2D array;
    static int[] searchMatrix(int[][] matrix, int target){
        int row = 0;
        int coloumn = matrix.length-1;

        while(row<matrix.length && coloumn>=0 ){
            if(matrix[row][coloumn]==target){
                return new int[]{row, coloumn};
            }
            if(matrix[row][coloumn]>target){
                coloumn --;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
