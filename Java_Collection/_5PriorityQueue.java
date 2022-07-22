package com.Java_Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _5PriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
// Priority as  a min_Heap
        System.out.println("as a Working in MIN Heap implement");
        pq.offer(24); // pushing element in queue
        pq.offer(12);
        pq.offer(36);
        pq.offer(48);

        System.out.println(pq);

        System.out.println(pq.poll()); // remove element highest priority queue

        System.out.println(pq);

        System.out.println(pq.peek());

        // now see Priority as a max_Heap
        System.out.println("as a Working in MAX Heap implement");
        PriorityQueue<Integer>pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.offer(24); // pushing element in queue
        pq1.offer(12);
        pq1.offer(48);
        pq1.offer(36);

        System.out.println(pq1);

        System.out.println(pq1.poll()); // remove element highest priority queue

        System.out.println(pq1);

        System.out.println(pq1.peek());
    }
}
