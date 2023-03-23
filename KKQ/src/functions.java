import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        //      System.out.println(OddEven(101));
//        System.out.println(Factorial(4));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x =sc.nextInt();
        System.out.println(Palindrome(x));
//        System.out.println(Reverse(1234567890));
//        System.out.println(grades(x));
//        System.out.println(prime(7));
        // Return the largest number;


//  static int returnLargest(int a, int b, int c){
//  int largest = a;
//  if(b>largest){
//      largest = b;
//  }
//  if (c>largest) {
//      largest =c;
//  }
//  return largest;
//    }


        //check odd even;

//    static String OddEven(int a){
//        if(a % 2 == 0) {
//        return "even";
//        }
//        return "odd";
//    }

        // IF A NUMBER IS PRIME OR NOT;


    }

    //wheater a number is prime or not;

//    static String prime(int x){
//        int count = 0;
//        for (int i = 1; i <=x; i++) {
//            if (x%i == 0) {
//                count=count+1;
//            }
//        }
//        if (count == 2) {
//             return "this is a prime number";
//        }
//        return "This is not a prime number";
//        }


    // Factorial of a number;


    //    static int Factorial(int x){
//        System.out.print(x + "=");
//        int Fac =1;
//        String new ="*";
//        for(int i=1;i<=x;i++){
//            System.out.print( i + "*");
//            Fac=Fac*i;
//        }
//        System.out.println();
//        return Fac;
//    }



    // marks and grades;
//    static String grades(int marks) {
//        String grades = "Enter valid marks";
//        if (marks < 40) {
//            grades = "FAIL";
//            return grades;
//        }
//        if (marks>=41 && marks<=50) {
//            grades = "DD";
//            return grades;
//        }
//        if (marks>=51 && marks<=60) {
//            grades = "CD";
//            return grades;
//        }
//        if (marks>=61 && marks<=70) {
//            grades = "BC";
//            return grades;
//        }
//        if (marks>=71 && marks<=80) {
//            grades = "BB";
//            return grades;        }
//        if (marks>=81 && marks<=90) {
//            grades = "AB";
//            return grades;
//        }
//        if (marks>=91 && marks<=100) {
//            grades = "AA";
//            return grades;
//        }
//
//
//        return grades;
//    }

    // whether a number is palindrome or not;


    static String Palindrome(int num){
        int original = num;
        int ref =0;
        while(num>0){
            int rem= num%10;
            ref=ref*10+rem;
            num /= 10;
        }
        if (ref==original){
            return "number is palindome";
        }
        return "number is not palindrome";
    }



    // reverse any number;

    static int Reverse(int x){
        int rev=0;
        while(x>0){
            int rem = x%10;
            rev=rev*10+rem;
            x /= 10;
        }
        return rev;
    }
}

