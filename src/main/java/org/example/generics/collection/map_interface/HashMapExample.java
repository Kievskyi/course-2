package org.example.generics.collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.putIfAbsent("Hello", "World"); //добавляет пару если в мапе такой ключ отсутствует
        System.out.println(map.get("Hello"));
        System.out.println(map.containsKey("Hello"));
        System.out.println(map.containsValue("World"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
    }
}
