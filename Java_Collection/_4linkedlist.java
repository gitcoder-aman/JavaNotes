package com.Java_Collection;

import java.util.LinkedList;

public class _4linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(7);
        l1.add(2);
        l1.add(8);
        l1.add(7);

        l1.addAll(0,l2);

        // method of linked list
        l1.addFirst(676); // add the first position
        l1.addLast(478); // add the last position

            for (int i = 0; i < l1.size(); i++) {
                System.out.print(l1.get(i) + " ");
            }
    }
}
