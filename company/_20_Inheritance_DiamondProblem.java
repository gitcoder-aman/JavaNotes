package com.company;

class Watch_Base_A{
    public void display(){
        System.out.println("I am buying a watch from Base");
    }
}
class Watch_Derived_B extends Watch_Base_A{

    public void display(){
        System.out.println("I am buying a watch from Derived1");
    }
}
class Watch_Derived_C extends Watch_Base_A{

    public void display(){
        System.out.println("I am buying a watch from Derived2");
    }
}
//Note: Multiple Inheritance not support in java and this is called Diamond Problem
//class Watch_Derived_D extends Watch_Derived_B,Watch_Derived_C{
//
//    @Override
//    public void display() {
//
//    }
//}
public class _20_Inheritance_DiamondProblem {
    public static void main(String[] args) {

        Watch_Base_A obj = new Watch_Base_A();
//        obj.display();
    }
}
