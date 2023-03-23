package com.company;

import java.util.Scanner;

public class MethodOverloading {
    static int Overloading(int a, int b, int c){
        return a*b*c;
    }

    static int Overloading(int a, int b){
        return a+b;
    }
    static int Overloading(int a, int b, int c, int d){
        return (a+b+c)/d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc. nextInt();
        int xy = sc. nextInt();
        int xz = sc. nextInt();
        int xx = sc. nextInt();
        int netValue = Overloading(x,xy,xz,xx);
        System.out.println(netValue);


        System.out.println(netValue);

    }


}
