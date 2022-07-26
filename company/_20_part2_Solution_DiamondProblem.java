package com.company;

//The solution to the diamond problem is default methods and interfaces.
// We can achieve multiple inheritance by using these two things.
interface DemoInterface1{

    public default  void display(){
        System.out.println("the display() method of DemoInterface1 invoked");
    }
}
interface DemoInterface2{
    public default void display(){
        System.out.println("the display() method of DemoInterface2 invoked");
    }
}
class DemoClass implements DemoInterface1,DemoInterface2{
    @Override
    public void display() {
        DemoInterface1.super.display();
        DemoInterface2.super.display();
    }
}
public class _20_part2_Solution_DiamondProblem  {

    public static void main(String[] args) {

        DemoClass obj = new DemoClass();
        obj.display();
    }
}
