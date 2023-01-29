package org.example.generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Denys", 15);
        Schoolar schoolar2 = new Schoolar("Denys", 12);

        Student student1 = new Student("Gsdfg", 122);
        Student student2 = new Student("Gsdfg", 122);

        Employee employee1 = new Employee("HUf", 12);
        Employee employee2 = new Employee("HUf", 12);

        Team<Schoolar> schoolarTeam = new Team<>("Dragons");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team<Employee> employeeTeam = new Team<>("Yahoo!");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Student> studentTeam = new Team<>("Always greens");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Wisdom");
        schoolarTeam2.addNewParticipant(schoolar1);
        schoolarTeam2.addNewParticipant(schoolar2);

        schoolarTeam.playWith(schoolarTeam2);
    }
}
