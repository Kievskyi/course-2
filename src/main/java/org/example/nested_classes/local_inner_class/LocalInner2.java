package org.example.nested_classes.local_inner_class;

public class LocalInner2 {
    public static void main(String[] args) {
        class Slozhenie implements Math2 {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }

        Slozhenie slozhenie = new Slozhenie();
        System.out.println(slozhenie.doOperation(5, 10));
    }
}

interface Math2 {

    int doOperation(int a, int b);
}
