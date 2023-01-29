package org.example.generics.collection.map_interface;


import org.example.generics.game.Student;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Double, Student> map = new LinkedHashMap<>(16, 0.75f, false);
        map.put(1.2, new Student("Denys", 1));
        map.put(4.2, new Student("Oleg", 2));
        map.put(8.6, new Student("Valia", 5));
        map.put(1.3, new Student("Krot", 3));

        System.out.println(map);

//        System.out.println(map.get("Hello"));
//        System.out.println(map.containsKey("Hello"));
//        System.out.println(map.containsValue("World"));
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());
    }
}
