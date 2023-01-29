package org.example.generics.collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Denys");
        set1.add("Vanya");
        set1.add("Olena");

        Set<String> set2 = new HashSet<>();
        set2.add("Rihanna");
        set2.add("Nikolay");
        set2.add("Olena");

        System.out.println(set1);

//        set1.addAll(set2);  //union
//        System.out.println(set1);
//        set1.retainAll(set2); //intersect(пересечение)
//        System.out.println(set1);
        set1.removeAll(set2); //subtract
        System.out.println(set1);



    }
}
