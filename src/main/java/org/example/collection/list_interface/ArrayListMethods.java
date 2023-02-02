package org.example.collection.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("Denys");
        list1.add("Elena");
        list1.add(0,"Valya");

        System.out.println(list1);
    }
}
