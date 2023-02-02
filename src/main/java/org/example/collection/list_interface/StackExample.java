package org.example.collection.list_interface;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Denys");
        stack.push("Igor");
        stack.push("Vasya");
        stack.push("Misha");
        stack.push("Oleg");

//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);

//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }

        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
