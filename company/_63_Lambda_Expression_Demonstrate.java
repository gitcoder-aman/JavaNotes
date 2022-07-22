package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class _63_Lambda_Expression_Demonstrate {
    public static void main(String[] args) {

        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        //Using Lambda expression to print all elements;
       // arr.forEach(n-> System.out.println(n));

        //You can print also this
       // arr.forEach(System.out::println);

        int[] a = {5,6,7,8,3};

        Arrays.sort(a);
        for (int element: a) {

            System.out.println(element);
        }
    }
}
