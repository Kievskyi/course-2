package org.example.generics.collection.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
//        ArrayList<String> list1 = new ArrayList<String>();
//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<String> list1 = new ArrayList<>(200);
        List<String> list1 = new ArrayList<>(200);
        List<String> list2 = new ArrayList<>(list1);

        list1.add("Denys");
        list1.add("Elena");
        list1.add("Valya");
        System.out.println(list1);
    }
}
