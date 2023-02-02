package org.example.collection;

import java.util.Objects;

public class NewStudent {
    String name;
    int course;

    public NewStudent(String name, int course) {
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
        NewStudent newStudent = (NewStudent) o;
        return course == newStudent.course && Objects.equals(name, newStudent.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
}
