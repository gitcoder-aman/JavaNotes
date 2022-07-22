package com.company;

class Employee{

    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("And my name is "+name);
    }

    public int getsalary() {
        return salary;
    }
}
public class _15_Oops {
    public static void main(String[] args) {

        Employee obj = new Employee(); //Instantiating a new Employee object
        Employee john = new Employee();
        //setting Attributes
        obj.id = 12;
        obj.name = "Aman";
        obj.salary = 34;

        john.id = 17;
        john.name = "John Khandelal";
        john.salary = 12;

        obj.printDetails();
        john.printDetails();

        int salary = john.getsalary();

        System.out.println(salary);
    }
}
