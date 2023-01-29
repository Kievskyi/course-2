package org.example.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee employee1 = new Employee(100, "Zaur", "Tregulov", 1000);
        Employee employee2 = new Employee(15, "Ivan", "Petrov", 5000);
        Employee employee3 = new Employee(123, "Ivan", "Sidorov", 15000);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        System.out.println("Before sorting \n" + list);

        Collections.sort(list, new SalaryComparator());
        System.out.println("After sorting \n " + list);

    }
}

//class IdComparator implements Comparator<Employee> {
//    @Override
//    public int compare(Employee emp1, Employee emp2) {
//        if (emp1.id == emp2.id) {
//            return 0;
//        } else if (emp1.id > emp2.id) {
//            return 1;
//        } else {
//            return -1;
//        }
//    }
//}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class Employee
        implements Comparable<Employee>
{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
//        Var 1
        if (this.id == o.id) {
            return 0;
        } else if (this.id > o.id) {
            return 1;
        } else {
            return -1;
        }

//        Var 2
//        return this.id - o.id;
//
//        Var 3
//        return this.id.compareTo(o.id);
//
//        Var 4
//        return this.name.compareTo(o.name);
//        Var 5
//        int result = this.name.compareTo(o.name);
//        if (result == 0) {
//            result = this.surname.compareTo(o.surname);
//        }
//
//        return result;
    }
}
