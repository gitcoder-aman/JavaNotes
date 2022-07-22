package com.Java_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _10CollectionClass {
    public static void main(String[] args) {

       List<Integer> list = new ArrayList<>();

       list.add(34);
       list.add(9);
       list.add(12);
       list.add(76);
       list.add(29);
       list.add(75);
       list.add(12);
        System.out.println("Min Element "+ Collections.min(list));
        System.out.println("Max Element "+ Collections.max(list));

        System.out.println("Frequency "+ Collections.frequency(list,12));

        // sort in ascending order
        Collections.sort(list);
        System.out.println(list);

        //sort in descending order
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
