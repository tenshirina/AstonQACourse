package org.example.lesson_5;

import java.util.Arrays;

class Employee1 {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee1(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void showInfo() {
        System.out.println("ФИО: " + name + ", Должность: " + position + ", Email: " + email + ", Номер телефона: " + phoneNumber + ", Зарплата: " + salary + ", Возраст: " + age);
    }
}

public class Task02 {
    public static void main(String[] args) {
        Employee1 [] employee1Arr = new Employee1[5];
        employee1Arr[0] = new Employee1("Sovina Maria", "CEO", "maria@yandex.ru", "+79245147854", 150000, 45);
        employee1Arr[1] =  new Employee1("Dumnov Dmitry", "Project manager", "dmytr187@mail.ru", "+79254562001", 80000, 27);
        employee1Arr[2] = new Employee1("Kotov Nikita", "Frontend developer", "kotik@gmail.com", "+79142100475", 65000, 24);
        employee1Arr[3] = new Employee1("Siveeva Victoria", "Designer", "vika61@mail.ru", "+79278545693", 70000, 28);
        employee1Arr[4] = new Employee1("Lavin Sergey", "Backend developer", "serlAv10@gmail.com", "+79265410448", 100000, 35);
    }
}

