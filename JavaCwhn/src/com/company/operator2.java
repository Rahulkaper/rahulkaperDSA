package com.company;
import java.util.Scanner;


public class operator2 {
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner sc = new Scanner(System.in);

        System.out.println("the age is");
        int age = sc.nextInt();



        if ( age>=18){
            System.out.println("yes you can drive");
        }
        else if( age>=100){
            System.out.println("you can not drive");
        }
        else{
            System.out.println("you cannot drive");

        }

    }
}
