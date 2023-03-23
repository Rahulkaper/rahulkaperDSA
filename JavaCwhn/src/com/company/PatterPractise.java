package com.company;

import java.util.Scanner;

public class PatterPractise {
    public static void main(String[] args) {
//        //     QUESTION1
//        System.out.println("Q1 increasing star triangle");
//        int a = 5;
//        for (int b = 1; b <= a; b++) {
//            for (int c = 1; c <= b; c++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        //        question2
//
//        System.out.println("Question2 decreasing triangle");
//
//        int n = 10;
//        for (int k = 1; k <= 5; k++) {
//            for (int l = k; l <= 5; l++) {
//                System.out.print("* ");
//            }
//
//
//            System.out.println();


        // Q3 triangle pattern with spaces;

//        System.out.println("Q3");
//        int x = 5;
//        for (int f = 1; f <= x; f++) {
//            for (int g = x; g <= 5; g++) {
//                System.out.print("  ");
//            }
//            for (int g = 1; g <= x; g++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        System.out.println("Enter the number");
        int d;
        Scanner sc = new Scanner(System.in);
        d = sc.nextInt();
        int factorial = 1;
        System.out.println("the factorial of  " + d);
        for (int i = d; i>=1; i--) {
            factorial *=i;
            System.out.print(factorial);

        }

    }}














