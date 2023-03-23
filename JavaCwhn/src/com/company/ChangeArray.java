package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class ChangeArray {
    static void Change( int[] arr){
        arr[0]=234;

    }
    public static void main(String[] args) {
//        int[] files={1,45,6,56};
//        System.out.println(Arrays.toString(files));
//        Change(files);
//        System.out.println(Arrays.toString(files));
        //2d arryas
        int[][] Arr = new int[3][2];
        Scanner sc = new Scanner(System.in);
        for(int row=0; row<3; row++) {
            for (int col = 0; col < Arr[row].length; col++){
                Arr[row][col]=sc.nextInt();
            }
        }
        for(int row=0; row<3; row++) {
//            for (int col = 0; col < Arr[row].length; col++) {
//               System.out.print(Arr[row][col]+" ");
//    System.out.print(Arrays.toString(Arr[row]));
//        }
                System.out.println(Arrays.toString(Arr[row]));
            }
            System.out.println();
        }

    }

