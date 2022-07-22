package com.company;

interface DemoAno{
    void meth1();
    void meth2();

}
/*class AnonyDemo implements  DemoAno{
    public void display(){
        System.out.println("Hello");
    }

    @Override
    public void meth1() {
        System.out.println("i am meth1");
    }

    @Override
    public void meth2() {
        System.out.println("I am meth2");
    }
}*/
public class _62_Anonymous_classes {

    public static void main(String[] args) {

       /* AnonyDemo obj = new AnonyDemo();
        obj.meth1();
        obj.meth2();*/

        // ek baar bnao rista fir nata khatam karo this is Anonymous class work.
        DemoAno obj = new DemoAno() {  // Anonymous class


            @Override
            public void meth1() {
                System.out.println("i am meth1");
            }
            @Override
            public void meth2() {
                System.out.println("i am meth2");
            }
        };
        obj.meth1();
        obj.meth2();
    }
}
