package com.company;

@FunctionalInterface
interface myFunctionalInterface{
    void thisMethod();
   // void thisMethod2();
}
class NewPhone extends  A{
    @Override
    public void meth2() {
        System.out.println("I am method 2 in class A");
    }
    @Deprecated
    public int sum(int a,int b){
        return a+b;
    }
}
public class _61_Annotations {
    @SuppressWarnings(" deprecation ")
    public static void main(String[] args) {

        NewPhone phone = new NewPhone();
        phone.meth2();
        phone.sum(5,6);

    }
}
