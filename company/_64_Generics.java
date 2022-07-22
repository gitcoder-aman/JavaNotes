package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class MyGenerics<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGenerics(int val,T1 t1,T2 t2){
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }
}
public class _64_Generics {
    public static void main(String[] args) {
//Generics Integer

        ArrayList<Integer> arrayList = new ArrayList(); // Non - Primitive datatype
        //ArrayList<int> arrayList = new ArrayList(); this will produce an error because int is primitive datatype
        //arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(643); // 2
//        arrayList.add(new Scanner(System.in));

        int a = (int)arrayList.get(1);
        System.out.println(a);

        MyGenerics<String,Integer> g1 = new MyGenerics(23,"MyString is my Stirng ",46);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str + int1);
    }
}
