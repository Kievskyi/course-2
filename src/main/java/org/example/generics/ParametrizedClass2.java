package org.example.generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair("KUKU", 123);
        System.out.println(pair1.getFirstValue());
        System.out.println(pair1.getSecondValue());
        Pair<Pair, Pair> pair = new Pair<>(new Pair("KUKU", 123), new Pair("RURU", 143));
        System.out.println(pair.getFirstValue() + " " + pair.getSecondValue());
    }
}

class Pair<V1, V2> {
    private V1 value1;

    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
