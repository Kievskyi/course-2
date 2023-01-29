package org.example.generics.collection.set_interface;

import org.example.generics.collection.NewStudent;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(10);
        set1.add(-100);

        TreeSet<NewStudent> set2 = new TreeSet<>(Comparator.comparing(NewStudent::getName));
        set2.add(new NewStudent("1", 10));
        set2.add(new NewStudent("235", 14));
        set2.add(new NewStudent("2355", 18));

        System.out.println(set2);

        System.out.println(set2.first());
        System.out.println(set2.last());
    }
}
