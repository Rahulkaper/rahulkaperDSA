import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] num = {{12,23,4,455,664,32},
                      {13,54,56,45,454,45},
                      {45,67,45,67,76,56}};
        int[][] rsum ={ {1,2,3},
                        {4,6,7}
                               };
        System.out.println(Max(rsum));
//        System.out.println(Arrays.toString(runningSum(rsum)));
//        System.out.println("enter the target element");
//        int target=sc.nextInt();
//        System.out.println(Arrays.toString(Search2D(num,target)));
//        System.out.println(Max(num) + "is the greatest element of num[] array");
    }

    // to find of the index of the searched element;
    static int linearsearch(int target, int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

    //Searching in 2D arrays;

    static int[] Search2D(int[][] arr, int target){
        for(int row =0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++ ){
                if (arr[row][col]==target){
                    return new int[] {row, col} ;

                }
            }

        }
        return new int[] {-1,-1};



    }

    //max value in a array;
    static int Max(int [][] arr){
        int max = Integer.MIN_VALUE;
        for (int row =0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++)
            if(arr[row][col]>max){
                max = arr[row][col];

            }
        }
        return max;
    }


    //running sum problem
     static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] sum= new int[n];
        for(int i=0; i<n; i++){
            if(i==0){
                sum[i]=nums[i];
            }
            else{
                sum[i]=nums[i]+sum[i-1];
            }
        }
        return sum;

    }


    // sum of the row in a 2D array;
    static int Maxwealth(int[][] num){
        int wealth=0;
        for(int row=0; row<num.length; row++){
            for(int col=0; col<num[row].length; col++){
                wealth = wealth+ num[row][col];

            }
        }
        return wealth;
    }
}
