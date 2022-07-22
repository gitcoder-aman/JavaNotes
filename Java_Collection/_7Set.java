package com.Java_Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class _7Set {
    public static void main(String[] args) {
        // duplicate value not allowed in set

        Set<Integer>set = new HashSet<>(); // all operation function is time complexity = O(1) in HashSet
//Random order way added in set
        System.out.println("Hash Set");
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(21);
        set.add(21);
        set.add(65);

        System.out.println(set);

        set.remove(54);
        System.out.println(set);

        System.out.println(set.contains(21));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);

        System.out.println("Linked Hash Set");

        Set<Integer>set1 = new LinkedHashSet<>();

        //added in set order by user
        set1.add(32);
        set1.add(2);
        set1.add(54);
        set1.add(21);
        set1.add(21);
        set1.add(21);
        set1.add(65);

        System.out.println(set1);

        System.out.println("Tree Set"); // all operation in O(Log n) in Tree Set
        //added in set element sorted order
        Set<Integer>set2 = new TreeSet<>();

        set2.add(32);
        set2.add(2);
        set2.add(54);
        set2.add(21);
        set2.add(21);
        set2.add(21);
        set2.add(65);

        System.out.println(set2);
    }
}
