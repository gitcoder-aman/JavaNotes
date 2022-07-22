package com.Java_Collection;

import java.util.HashSet;

public class _11HashSet {
    public static void main(String[] args) {

        HashSet<Float>myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(6.5f);
        myHashSet.add(8.7f);
        myHashSet.add(3.5f);
        myHashSet.add(11.4f);
        myHashSet.add(16.9f);

        System.out.println(myHashSet);
    }
}
