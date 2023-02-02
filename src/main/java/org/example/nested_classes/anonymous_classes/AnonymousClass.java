package org.example.nested_classes.anonymous_classes;

public class AnonymousClass {
    public static void main(String[] args) {
        Math math = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };

        System.out.println(math.doOperation(3, 6));


    }
}

interface Math {

    int doOperation(int a, int b);
}
