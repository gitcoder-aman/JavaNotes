package com.Java_Collection;

import java.util.LinkedList;
import java.util.Queue;

public class _3Queue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
//FIFO
        q.offer(12); // pushing element in queue
        q.offer(24);
        q.offer(36);
        q.offer(48);

        System.out.println(q);

        System.out.println(q.poll());  // pop element in queue

        System.out.println(q);

        System.out.println(q.peek());

    }
}
