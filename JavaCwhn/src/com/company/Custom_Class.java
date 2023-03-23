package com.company;
class Employees{
    int id;
    String name;
    //id and name are the attributes (properties) of the custom class(Employees)
    public void AllDetails(){
        //creating a object in the class to get all the details at once
        System.out.println("The name of the employee is "+ name);
        System.out.println("The id of the employee is "+ id);


    }

}

public class Custom_Class {
    public static void main(String[] args) {
        Employees Rahul = new Employees();
        Rahul.id =12;
        Rahul.name = "rahul kaper";
//        System.out.print(Rahul.id+" is the id of the employee");
//        System.out.print(Rahul.name);

        Employees john = new Employees();
        john.id= 134;
        john.name= "abhinav";
        john.AllDetails(); //calling details by using Method;

    }
}
