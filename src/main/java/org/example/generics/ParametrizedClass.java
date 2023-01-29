package org.example.generics;

public class ParametrizedClass {
    public static void main(String[] args) {
//        Info<String> info = new Info<>("Denys");
//        System.out.println(info);
//        info.getValue();

//        Info<Double> info2 = new Info<>(123.1);
//        System.out.println(info2);
//
//        info2.getValue();
    }
}

class Info <T extends Number & I1 & I2> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "({" + value + "})";
    }

    public T getValue() {
        return value;
    }
}

interface I1{}
interface I2{}
