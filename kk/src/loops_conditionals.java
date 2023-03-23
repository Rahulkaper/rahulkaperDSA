import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class loops_conditionals {
    public static void main(String[] args) {
        //Q. area of a circle;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the radius");
//        double radius = sc.nextInt();
//        double pi=3.14d;
//        double area=  (pi * radius*radius);
//        System.out.println("area of the circle is");
//        System.out.println(area + " "+"cm2");
        //Factorial of a number
//        System.out.println("ENTER THE NUMBER");
//        int n = sc.nextInt();
//        int FACTORIAL=1;
//        for (int i=1; i<=n; i++){
//            FACTORIAL =FACTORIAL*i;
//        }
//        System.out.println(FACTORIAL);
//
//        Q.) Averaage of n numbers
//        System.out.println("enter the 1st number:");
//        int num1= sc.nextInt();
//        System.out.println("enter the nth number:");
//        int N = sc.nextInt();
//       double ans =0;
//       for (int i=num1; i<=N; i++){
//           ans=ans+i;
//       }
//        System.out.println(ans/N);


        //clumsy factorial
//        int x=4;
//       int  x1=x-1; //3
//        int fac= x*x1;  //4*3
//        int x2=x1-1;  //2
//        int fac1=fac/x2; //4*3/2
//        int x3=x2-1;  //1
//        int fac2 = fac1+x3;  //4*3/2+1
//        System.out.println(fac2);


        //distance between two points

//        double x1,y1,x2,y2;
//        System.out.println("Enter x1 :");
//        x1=sc.nextInt();
//        System.out.println("Enter x2 :");
//        x2=sc.nextInt();
//        System.out.println("Enter y2 :");
//        y2=sc.nextInt();
//        System.out.println("Enter y1 :");
//        y1=sc.nextInt();
//        double dist= Math.sqrt((x2-x1)*(x2-x1)+ (y2-y1)*(y2-y1));
//        System.out.println("the distance between the two points is" + dist);


        //Discount on products
//        System.out.println("Enter the marked price");
//        double price = sc.nextDouble();
//        System.out.println("Enter the discount");
//        double discountPercent = sc.nextDouble();
//        double discountPrice = discountPercent/100 * price;
//        System.out.println("the discounted amount is :" + discountPrice);
//        double FinalPrice = price-discountPrice;
//        System.out.print("discounted price is:" + FinalPrice);



        // batting average

//       System.out.print("enter runs :");
//        int runs = sc.nextInt();
//        System.out.println("Enter the number of dismissals");
//        int dismissals = sc.nextInt();
//        double average = runs/dismissals;
//        System.out.println("average :" + average );


          // sum of  n numbers
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i=1; i<=n; i++){
//            sum= sum+i;
//        }
//        System.out.println("the sum the N numbers is : " + sum);

        // sum of the digits of any number;
//        System.out.println("enter the number : ");
//        int num = sc.nextInt();
//        int ans =0;
//        while (num>0){
//            int rem = num %10;
//            ans = ans+rem;
//            num/=10;
//        }
//        System.out.println("The sum of the digits of the number is ->" + ans );


        // compound interest
        System.out.println("Enter the principle amount : ");
        double price = sc.nextDouble();
        System.out.println("Enter the intereset rate : ");
        double rate = sc.nextDouble();
        System.out.println("Interest applied per annum : ");
        double n = sc.nextDouble();
        System.out.println("Enter the time period");
        double t =sc.nextDouble();
        double finalamount;
        double new2=(1+ (0.01*rate/n));
        
        finalamount = Math.pow(new2,(n*t));
        double finalamount2 = price*finalamount;

        System.out.println("final amount after the Interset is : " + finalamount2);
      }

}

