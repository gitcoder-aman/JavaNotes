package com.company;

class Employee1{

    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class _16_Oops_Practice {
    public static void main(String[] args) {

      //Practice 1
        Employee1 aman = new Employee1();
        aman.setName("Aman Kumar");
        System.out.println(aman.getName());
        aman.salary = 232;
        System.out.println(aman.getSalary());
    }
}
