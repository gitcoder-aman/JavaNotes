package com.company;

class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method1");
    }
}
 interface MyInt{
    void display();
}
public class _66_PracticeSet {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        MyDeprecated d = new MyDeprecated();
        d.meth1();

        MyInt i = () -> System.out.println("I am display"); // Lambda Expression
    }
}
