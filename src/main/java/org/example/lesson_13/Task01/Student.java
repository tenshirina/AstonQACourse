package org.example.lesson_13.Task01;

import java.util.*;

class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrade() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public boolean canAdvance() {
        return getAverageGrade() >= 3.0;
    }

    public void advanceCourse() {
        if (canAdvance()) {
            this.course++;
        }
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public static void deleteLowStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3.0);
    }

    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            student.advanceCourse();
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    @Override
    public String toString() {
        return name + " (Курс " + course + ", Средний балл: " + getAverageGrade() + ")";
    }
}
