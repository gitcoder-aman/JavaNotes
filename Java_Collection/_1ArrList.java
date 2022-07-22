package com.Java_Collection;

import javax.swing.*;
import java.util.*;


public class _1ArrList {
    public static void main(String[] args) {

       ArrayList<Integer> l1 = new ArrayList<>();
       ArrayList<Integer> l2 = new ArrayList<>(5);
       ArrayList<Integer> l3 = new ArrayList<>(9);

      /* size = n
               n + n/2 + 1*/ // internally size automatic increase in arrayList
       l2.add(15);
       l2.add(18);
       l2.add(19);

       l1.add(7);
       l1.add(2);
       l1.add(8);
       l1.add(7);

       l1.add(0,6); // O(n)
       l1.add(0,2);

       l1.addAll(0,l2); // add to one array to second array

     //   l1.clear();

       for (int i = 0; i < l1.size(); i++){
           System.out.print(l1.get(i) + " ");
       }
        System.out.println();

        l1.set(1,566); // O(1)
        l1.remove(3); // O(n)

        System.out.println(l1.clone());
        System.out.println(l1.contains(27));// true/false  //O(n)
        System.out.println(l1.indexOf(7)); // first index of value return
        System.out.println(l1.lastIndexOf(7)); // last index of value return

        Object[] arr = l1.toArray();

        System.out.println("Elements of ArrayList"
                + " as Array: "
                + Arrays.toString(arr));

        // trimToSize() method

        l3.add(2);
        l3.add(4);
        l3.add(5);
        l3.add(6);
        l3.add(11);

        l3.trimToSize(); // internally save the memory because this arraylist reserved 9 block but uses 5 block.
        l3.remove(Integer.valueOf(6)); // Delete 6 number
        for (Integer number: l3) {
            System.out.print(number + " ");
        }
        System.out.println();
        // Through iterator

        Iterator<Integer>it = l3.iterator();
        while (it.hasNext()){
            System.out.println("Iterator "+ it.next());
        }
    }

}
