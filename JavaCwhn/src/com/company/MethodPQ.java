package com.company;

public class MethodPQ {
    // questions 1
    static void Multiplication(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", a, i, a * i);
        }
    }

//question2
    static void Pattern(int a){
        for( int i =0; i<=a; i++){
            for(int j =0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
//
//
        }
    }
//  question 3
    static int Q3(int a){
      int c=0;
       for( int i=1; i<=a; i++){
         c =c + i;


        }
        return c;
    }
    static void PatternQ4(int a){
        for(int i =0; i<=a; i++){
            for(int j = i; j<a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    Question 5;
    static int fib(int n){
        if(n==1 || n==2){
            return n-1;
        }
        else {
            return fib(n-1) + fib(n-2);



        }
    }
//    static int FibonacciQ5(int a){
//        int c=0;
//        for(int i=1; i<=a; i++){
//            c= (c+i) +(c+(i-1));
//            System.out.println(c);
//        }
//        if (c==1 ){
//            return 1;
//        }
//        else if(c==0){
//            return 0;
//        }
//        else{
//            return c+(c-1)+(c-2);
//        }
//    }




        public static void main (String[]args){
         // questions 1
//            System.out.println("Enter the number");
//              Scanner sc = new Scanner(System.in);
//               int x = sc.nextInt();
//                   Multiplication(x);

//  question 3

          int x = 5;
//            System.out.println(Q3(x);
//            Question 4
//              Scanner ab = new Scanner(System.in);
//               System.out.println("Enter the number");
//                int y = ab.nextInt();
//                  PatternQ4(y);
//            Question 5
//             int e=6;
//              FibonacciQ5(e);
               //  int u = 5;
            int g=7;
            System.out.println(fib(g));


    }
}


