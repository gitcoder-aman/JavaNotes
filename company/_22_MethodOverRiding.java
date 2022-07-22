package com.company;

class A{
    public int a;
    public int constructor(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override  // just you know continue or not override
    public void meth2(){  // Method OverRiding
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class _22_MethodOverRiding {
    public static void main(String[] args) {

        A obj = new A();
        obj.meth2();
    }
}
