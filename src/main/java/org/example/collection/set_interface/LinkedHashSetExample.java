package org.example.collection.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> integers = new LinkedHashSet<>();
        integers.add(12);
        integers.add(125);
        integers.add(126);
        integers.add(127);
        integers.add(12623);
        System.out.println(integers);

        integers.remove(126);
        System.out.println(integers);

        System.out.println(integers.contains(12623));
    }
}
