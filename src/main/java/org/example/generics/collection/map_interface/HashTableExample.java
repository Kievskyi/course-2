package org.example.generics.collection.map_interface;


import org.example.generics.game.Student;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashtable = new Hashtable<>();
        hashtable.put(1.2, new Student("Denys", 1));
        hashtable.put(4.2, new Student("Oleg", 2));
        hashtable.put(8.6, new Student("Valia", 5));
        hashtable.put(1.3, new Student("Krot", 3));

        System.out.println(hashtable);
    }
}
