package org.example.collection.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.addFirst(2);
        deque.addLast(323);
        deque.offerFirst(1); //тоже добавление  без исклюбчений
        deque.offerLast(8);

        System.out.println(deque);

        deque.removeFirst();
        deque.removeLast();
        deque.pollFirst(); //это все удаление
        deque.pollLast();

        System.out.println(deque);

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
    }
}
