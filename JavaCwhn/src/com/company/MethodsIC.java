package com.company;

public class MethodsIC {
   static void IntegerChange(int b){
        b = 98;
   }
    static void IntegerChange2(int [] arr){
        arr [0] = 34;
    }

    public static void main(String[] args) {
//case 1 change the integer;
        int x = 45;
        IntegerChange(x);
        System.out.println(x);
// the value of x does not change in this case as the methods is copied back
//   case 2 : change the value of the integer in array
     int [] mark = {23, 23, 45, 45, 45};
     IntegerChange2(mark);
     System.out.println(mark[0]);
// this time the value changes as when we create an array it is saved in the form of stack and it has some memoru location and address, when we call
//  method and add the array name it is actually the memory address which we call with methods therefore it changes the parameters of the arrau
    }


}
