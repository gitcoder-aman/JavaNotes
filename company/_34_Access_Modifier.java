package com.company;

class C1{
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class _34_Access_Modifier {
    public static void main(String[] args) {

        C1 obj = new C1();
        obj.meth1();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
       // System.out.println(obj.a); // error because a is private in package
    }
}
