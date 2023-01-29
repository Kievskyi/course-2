package org.example.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Zaur", "Ivan", "Maria"));

        System.out.println("Before sorting");
        System.out.println(list);

        Collections.sort(list);
        System.out.println("After sorting");
        System.out.println(list);
    }
}
