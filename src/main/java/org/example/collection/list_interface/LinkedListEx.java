package org.example.collection.list_interface;

import java.util.LinkedList;
import java.util.Objects;

public class LinkedListEx {
    public static void main(String[] args) {
        Student student1 = new Student("Denys", 1);
        Student student2 = new Student("Denys", 2);
        Student student3 = new Student("Denys", 3);
        Student student4 = new Student("Denys", 4);
        Student student5 = new Student("Denys", 5);

        LinkedList<Student> student = new LinkedList<>();
        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student4);
        student.add(student5);

        student.add(1, new Student("Vasya", 4));

        System.out.println(student);
    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }
}
