package com.company;

class Base1{
    Base1(){
        System.out.println("I am a base class Constructor:");
    }
    Base1(int a){
        System.out.println("I am overload constructor of Base with value of a as: "+a);
    }
}
class Derived1 extends Base1{


    Derived1(){
        // 0 is as a argument
      //  super(0);  // for you can run constructor with argument from Base1 class.
                     // if you are not use keyword then run constructor without argument

        System.out.println("I am a Derived class Constructor:");
    }
    Derived1(int x,int y){
        super(x); // Base1 inherit and run constructor with argument
        System.out.println("I am an Overloaded constructor of Derived with value of y as: "+ y);
    }
}
class ChildOfDerived extends Derived1{

    ChildOfDerived(){
        System.out.println("I am child of Derived Constructor");
    }
    ChildOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am an Overloaded Constructor of Derived with value of z as: " +z);
    }
}
public class _21_Inheritance_Constructor {
    public static void main(String[] args) {

       // Base1 obj = new Base1();

       // Derived1 ob = new Derived1();
       // Derived1 ob1 = new Derived1(4,5);

        //ChildOfDerived cd = new ChildOfDerived();

        ChildOfDerived cd1 = new ChildOfDerived(5,6,7);

    }
}
