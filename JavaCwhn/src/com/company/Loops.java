package com.company;

public class Loops {
    public static void main(String[] args) {
//        System.out.println("lets study loops");
//        int x;
//        x=100;
//        while (x>=100) {
//            System.out.println(x);
//            x++;


//        }
//        while (true){
//            System.out.println("example of boolean condition in while loop!");
//        }
//        do-while loop
//        int x = 100;
//        do{
//            System.out.println(x);
//            x++;
//        }
//        while(x>10);
//        int x = 1;
//        do {
//            System.out.println(x);
//            x++;
//
//        }while(x<0);

//         int x = 10;
//          for (x = 4; x<10; x++){
//              System.out.println(x);
//    }
//          int x =10;
//        for ( x = 1; x < 5; x++) {
//            System.out.println(x);
//        first 100 odd natural numbers using for loops
//        for(int i = 1; i<=49; i++ ){
//            System.out.println(2*i+1);
//        }
//          Practise set 5
//        question 1
//        int x=4;
//        for(int i =x; i>=0; i--){
//            for(int j=0; j<i ;j++) {
//
//                System.out.print("*");
//
//            }
//            System.out.print("\n");
//        question 2  write a program to get the sum of first n even numbers.

//        int x =50;
//int y= 0;
//for(x=0;x<=50;x++){
//   y = y +  (2*x);
//
//}
//        System.out.println(y);
//  Q3= write a program to print a multilication table of a number;
//        int a = 4;
//        for(int i=1; i<=10;i++){
//            System.out.println("%d X %d=%d\n" a ,i,a*i);
//        }
//         Q3 printing pattern
//        int e = 3;
//        for(int i=2; i<e; ){
//            System.out.println(i);
//        }


//            int x=0;
//            for(int i=0; i<=7; i++){
//               x=x+i;
//                System.out.print(x);
//                System.out.println();

//        float num = 10;
//         float rem =  num % 1000;
//
//        System.out.println(rem);
//        Q. find how many number of 7 is occouring;
//        int n=1751777721;
//        int ans =0;
//        while(n>0) {
//            int rem = n % 10;
//            n /= 10;
//            if (rem == 7) {
//                ans++;
//
//            }
//        }
//        System.out.println(ans);
        //Q.reversing a number
//        int n2= 103483;
//        int ans2 =0;
//        while(n2>0){
//            int rem = n2%10;
//            n2/=10;
//            ans2 = ans2*10+rem;
//
//        }
//        System.out.println(ans2);
        int n=234;
        int sum =0;
        int product=1;
        int ans =0;
        while(n>0){
            int rem =n%10;
            n/=10;
            product=product*rem;
            sum =sum +rem;
        }
        ans=ans+(product-sum);
        System.out.println(ans);

    }
}





