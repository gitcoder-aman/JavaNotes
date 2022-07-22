package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("I am a Constructor of Base2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract  public void greet();
    abstract  public void greet1();
}
class Child extends Parent{

    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet1() {
        System.out.println("Good AfterNoon");
    }
}
abstract class Child1 extends Parent{
    public void th(){
        System.out.println("I am Good");
    }
}
public class _25_Abstract { // mean of Abstract "Khyali palaw" "exits in only thought"
    public static void main(String[] args) {

        Child ob = new Child(); //  You can do
       // Child1 ob1 = new Child(); //  You can't do , this is also abstract
       // Parent obj = new Parent(); // You can't do because parent is abstract class, it's not allow to create object.

    }
}
