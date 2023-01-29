package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>(List.of(1.2, 2.3,4.5));
        showListInfo(list);
        List<String> list2 = new ArrayList<>(List.of("Hey", "Bye"));
        System.out.println(list2);
        List<? super Number> list1 = new ArrayList<>();

        ArrayList<Double> list3 = new ArrayList<>();
        list3.add(3.2);
        list3.add(3.1);
        list3.add(3.0);
        System.out.println(sum(list3));

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(3);
        list4.add(3);
        list4.add(32);
        System.out.println(sum(list4));
    }

    static void showListInfo(List<?> list) {
        System.out.println(list);
    }

    public static Double sum(ArrayList<? extends Number> list) {
        double sum = 0;

        for (Number number : list) {
            sum += number.doubleValue();
        }

        return sum;
    }
}
