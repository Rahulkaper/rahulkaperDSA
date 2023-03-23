package com.company;

class Employee{
    int salary;
    String name;
    public int Getsalary(){
        return salary;
    }
    public String Getname(){
        return name;
    }
    public void Setname(String n){
        name =n;
    }
}

class cellphone{


    public String Ring(String n){
        n="...Ringing...";
        return n;
    }
    public void Vibrate(){
        System.out.println(("...Vibrating..."));
    }

}

class square{
    int side;

    public int Area(){
        return side*side;

    }
public int perimeter(){
        return 4*side;
}
}

public class Custom_Class_QuestionsCwh {
    public static void main(String[] args) {
        Employee Rahul = new Employee();
        Rahul.salary=100000;
        Rahul.name ="Rahul kaper";
        Rahul.Setname("Rahulkumar");
//        System.out.println(Rahul.Setname() );
        // Question 2
        cellphone samsung = new cellphone();
        cellphone apple = new cellphone();
       


        samsung.Vibrate();

// question 3
 square parameter = new square();
 parameter.side =12;
        System.out.println("the side of the square is "+ parameter.side);
        System.out.println("the area of the square is " + parameter.Area());


    }
}
