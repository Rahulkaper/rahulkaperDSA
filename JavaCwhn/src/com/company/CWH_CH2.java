package com.company;
import java.text.CharacterIterator;
import java.util.Scanner;
public class CWH_CH2 {
    public static void main(String[] args){

//        double x = 3;
//        double y = 4;
//        double z = Math.sqrt(x*x + y*y);

//        System.out.println(z);

        System.out.println("enter base");
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        System.out.println("enter altitude");
        double altitude = sc.nextDouble();
        double hypotenues = Math.cbrt(altitude*altitude + base*base);

        System.out.println(" The hypotenues is " + hypotenues );

//        double z= Math.sqrt;
//        System.out.println("My name is rahul\nI am learning java\nhave high hopes with self\nhope this works as desired by me!");
//        System.out.print("a\tb\tc\n0\t0\t1\n1\t1\t0");



    }
}
