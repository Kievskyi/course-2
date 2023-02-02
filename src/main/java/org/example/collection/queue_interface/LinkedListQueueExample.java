package org.example.collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        Queue<String> list = new LinkedList<>();
        list.add("Denys");
        list.add("Oleg");
        list.add("Ivan");
        list.add("Sasha");

        System.out.println(list);

        list.poll(); //удаляет первый жлемент в очереди и не выбрасывает ексепшена если очередь пуста
        list.element(); //показывает первый элемент в очереди
        list.peek(); //тоже самое что и element но только не выбрасивает ексепшен если очередь пуста

    }
}
