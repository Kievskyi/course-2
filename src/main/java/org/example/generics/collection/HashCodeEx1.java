package org.example.generics.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student1, Double> map = new HashMap<>();
        map.put(new Student1("Denys", "Dudnik", 1), 1.5);
        map.put(new Student1("Elena", "Dudnik", 2), 2.6);
        map.put(new Student1("Masha", "Zhenkina", 3), 3.9);

        System.out.println(map);
        Student1 student = new Student1("Denys", "Dudnik", 1);
        Student1 student1 = new Student1("Igor", "Sidorov", 4);

        boolean result = map.containsKey(student);
        System.out.println(result);

        System.out.println(student.hashCode());

    }
}

class Student1 {
    String name;
    String surname;
    int course;

    public Student1(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return course == student1.course && Objects.equals(name, student1.name) && Objects.equals(surname, student1.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}
