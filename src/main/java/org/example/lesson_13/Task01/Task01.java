package org.example.lesson_13.Task01;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Mark", "767", 1, Arrays.asList(4, 3, 5)));
        students.add(new Student("Igor", "668", 2, Arrays.asList(2, 3, 2)));
        students.add(new Student("Marina", "765", 1, Arrays.asList(5, 4, 4)));
        students.add(new Student("Ivan", "564", 3, Arrays.asList(3, 3, 3)));

        Student.deleteLowStudents(students);

        Student.promoteStudents(students);

        System.out.println("\nСписок студентов после перевода на следующий курс:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nСтуденты выбранного курса:");
        Student.printStudents(students, 2);
    }
}
