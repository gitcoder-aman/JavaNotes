package com.Java_Collection;


import java.util.HashSet;
import java.util.Set;

public class _7partSet {
    public static void main(String[] args) {

        Set<_7PartStudent>studentSet  = new HashSet<>();

        studentSet.add(new _7PartStudent("Aman",3));
        studentSet.add(new _7PartStudent("Rahul",5));
        studentSet.add(new _7PartStudent("Manish",8));
        studentSet.add(new _7PartStudent("Rohit",3));

        _7PartStudent s1 = new _7PartStudent("Anuj",2);
        _7PartStudent s2 = new _7PartStudent("Rohit",2);

        System.out.println(s1.equals(s2));
        System.out.println(studentSet);
    }
}
