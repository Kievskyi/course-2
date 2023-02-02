package org.example.collection.queue_interface;

import java.util.PriorityQueue;

public class PriorityQueuExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(8);
        priorityQueue.add(9);
        priorityQueue.add(-3);
        priorityQueue.add(-303);
        System.out.println(priorityQueue.peek());
    }
}
