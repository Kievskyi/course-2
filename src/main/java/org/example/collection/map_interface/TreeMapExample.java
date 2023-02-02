package org.example.collection.map_interface;


import org.example.generics.game.Student;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        treeMap.put(1.2, new Student("Denys", 1));
        treeMap.put(4.2, new Student("Oleg", 2));
        treeMap.put(8.6, new Student("Valia", 5));
        treeMap.put(1.3, new Student("Krot", 3));
        System.out.println(treeMap);

        treeMap.get(1.2);

        treeMap.remove(4.2);

        System.out.println(treeMap.descendingMap()); //реверс дерева
        System.out.println(treeMap.tailMap(1.3)); //вернет все значения после этого ключа и этот включительно
        System.out.println(treeMap.headMap(1.3)); //вернет все значения до этого ключа
        System.out.println(treeMap.lastEntry()); //вернет последнгий элемент
        System.out.println(treeMap.firstEntry());//вернет первый элемент


    }
}
