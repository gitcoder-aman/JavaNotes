package com.Java_Collection;

import java.util.ArrayDeque;

public class _6arrayDequeue {
    public static void main(String[] args) {

        ArrayDeque<Integer>ad = new ArrayDeque<>();
      /*  ad.add(6); // when easily not added in deque then throw exception
        ad.add(56);
        ad.add(9);*/
        ad.offer(6);  // come from queue
        ad.offer(56);
        ad.offer(9);
        //ad.addFirst(59);
        ad.offerFirst(59);  // arrayDeque
        ad.offerLast(10);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
        System.out.println(ad);

        System.out.println("Peek Element "+ad.peek());
        System.out.println("Peek First "+ad.peekFirst());
        System.out.println("Peek Last "+ad.peekLast());

        System.out.println(ad.poll());
        System.out.println("Poll() "+ ad);

        System.out.println(ad.pollFirst());
        System.out.println("pollFirst() "+ ad);

        System.out.println(ad.pollLast());
        System.out.println("PollLast() "+ ad);
    }
}
