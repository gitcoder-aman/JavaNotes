package com.company;

@FunctionalInterface // only 1 method is contained in interface
interface DemoAno1{
    void meth1(int a);
   // void meth2();

}
//this is use here implements or use Lambda Expression
/*class Amanfunc implements  DemoAno1{

    @Override
    public void meth1() {
        System.out.println("This is method:");
    }
}*/
public class _63_Lambda_Expression {

    public static void main(String[] args) {

        //through implements
      //  DemoAno1 obj = new Amanfunc();
      //  obj.meth1();

        //through Lambda Expression
        DemoAno1 obj = (a)->{
            System.out.println("I am method 1 from this Lambda "+a);
        };
        obj.meth1(6);
    }
}
