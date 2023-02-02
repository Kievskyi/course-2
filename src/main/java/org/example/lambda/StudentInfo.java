package org.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo {

    void testStudents(List<Student> students, StudentChecks sc) {
        for (Student student : students) {
            if (sc.check(student)) {
                System.out.println(student);
            }
        }
    }


//        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.printStudentOverGrade(list, 8);
//        System.out.println("__________________________");
//        studentInfo.printStudentUnderAge(list, 30);
//        System.out.println("__________________________");
//        studentInfo.printStudentMixCondition(list, 20, 9.5, 'f');
}

//    void printStudentOverGrade(List<Student> students, double grade) {
//        for (Student student : students) {
//            if (student.avgGrade > grade) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    void printStudentUnderAge(List<Student> students, int age) {
//        for (Student student : students) {
//            if (student.age < age) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    void printStudentMixCondition(List<Student> students, int age, double grade, char sex) {
//        for (Student student : students) {
//            if (student.age > age && student.avgGrade < grade && student.sex == sex) {
//                System.out.println(student);
//            }
//        }
//    }

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.3);
        Student st3 = new Student("Elena", 'f', 19, 1, 10.5);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.8);
        Student st5 = new Student("Maria", 'f', 23, 5, 9.4);

        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo info = new StudentInfo();
        info.testStudents(list, new StudentChecks() {
            @Override
            public boolean check(Student student) {
                return student.age < 30;
            }
        });
        System.out.println("__________________________");

        info.testStudents(list, s -> s.avgGrade > 8);
        

    }
}


interface StudentChecks {
    boolean check(Student student);
}




