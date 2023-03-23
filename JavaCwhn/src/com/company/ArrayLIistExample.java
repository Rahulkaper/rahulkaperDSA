package com.company;

public class ArrayLIistExample {

    public static void main(String[] args) {

//        ArrayList<Integer> rollnumber = new ArrayList<>(13);
//       rollnumber.add(23);
//        rollnumber.add(54);
//        rollnumber.add(54);
//        rollnumber.add(2354);
//        rollnumber.add(45);
//        rollnumber.add(54);
//        rollnumber.add(98);
//        rollnumber.add(54);
//        rollnumber.add(81);
//        rollnumber.add(65);
//        rollnumber.add(65);
//        rollnumber.add(59);
//        rollnumber.add(8754);
//        rollnumber.add(23);
//        rollnumber.add(23);
//        rollnumber.add(23);
//        rollnumber.add(23);
//        rollnumber.add(23);
//        System.out.println(rollnumber);

// swaping array
        int[] newArr = {1,4,5, 4,4};
        swap(newArr,1,3);
        System.out.print(newArr);

    }
    static void swap ( int[] arr, int index1, int index2){
        int temp= arr[1];
        arr[1]=arr[2];
        arr[2]=temp;

    }
}
