package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class ParametrizedMethod {
    public static void main(String[] args) {
        Integer element = GeMethod.getSecondElement(new ArrayList<>(List.of(1, 2, 5)));
        System.out.println(element);
    }
}

//class Parent {
//    public void abc(Info<String> info) {
//        info.getValue();
//    }
//}

//class Child extends Parent{
//    @Override
//    public void abc(Info<Integer> info) {
//        info.getValue();
//    }
//}


class GeMethod {
    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}

