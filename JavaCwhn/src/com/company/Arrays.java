package com.company;

public class Arrays {
    public static boolean toString;

    public static void main(String[] args) {
 /*       System.out.println(" arrays are the objects used to save similar types of data");
        int []marks=new int[5];
        marks[0] = 100;
        marks[2]=101;
        marks[1]=102;
        marks[3]=103;
        marks[4]=104;
        System.out.println("marks of five students are ");
        System.out.println(marks[4]);
        */
//       int [] marks = {29,34, 45, 22,43};
//        System.out.println(marks[0]);
//        for(int i=0; i<marks.length; i++){
//            System.out.println(marks[i]);
//
//        }

//   for reverse order
//        System.out.println("for reverse order ");
//        for(int j=marks.length -1; j>=0; j--){
//            System.out.println("this is marks[" +j +"]"+marks[j]);
//        }
//        System.out.println( "by using for-each loop " );
//        for (int element: marks){
//            System.out.println(element);
//         practise set question 1.

        //float [] questions = {20.4f, 30.5f, 34.65f, 54.78f, 37.78f };
  //      System.out.println(questions[0]+questions[1]+questions[2]+questions[3]+questions[4]);
//        double sum= 0;
//        for(float element: questions){
//         sum = sum+ element;
//
//        }
//        System.out.println(sum);

//    practise set queston 2
//        float [] questions = {20.4f, 30.5f, 34.65f, 54.78f, 37.78f };
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number");
//        float a = sc.nextFloat();
//        boolean presentInArray = false;
//        for(float elements : questions){
//            if(a==elements) {
//                presentInArray = true;
//                break;
//            }
//            }
//            if(presentInArray){
//                System.out.println("the value is presenrt in Array");
//
//            }
//            else{
//                System.out.println("the value is not present in Array");
//            }
//       q3 average of the elements of an array considering them as the marks of students in physics
//        double [] PhysicsMarks = {30.5, 100, 98.5, 56.7, 78};
//        double sum = 0;
//        for( double elements: PhysicsMarks){
//            sum=sum+elements;
//        }
//        System.out.println("the average value of the marks present in the array is : "+ sum/PhysicsMarks.length);1

        //quesetion4 create two matrieces of size 2x3 and add them;
//
//        int [][] mat1 = { { 1, 2, 3 },
//                          { 2,3,4}  };
//        int[][]mat2=    {    { 3,4,5 },
//                          { 5,6,7 } };
//        int [][]result= { {0,0,0},
//                          {0,0,0}};
//
//
//        for(int i=0;i<mat1.length;i++){
//            for(int j=0;j<mat1[i].length;j++){
//                result[i][j] = mat1[i][j]+mat2[i][j];
//                System.out.print(result[i][j] + " ");
//
//
//            }
//            System.out.println();
//        }


        // program to revers an array;
        int [] newArray = {12,34,445,65,44};
        int temp;
        int l =newArray.length;
        int n = Math.floorDiv(l,2);
        for(int i=0 ;i<n;i++){
            temp=newArray[i];
            newArray[i]=newArray[l-i-1];
            newArray[l-i-1]=temp;
        }

        for(int element:newArray) {
            System.out.println(element);
        }

    }


}



