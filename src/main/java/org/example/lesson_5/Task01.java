package org.example.lesson_5;

class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
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

public class Task01 {
    public static void main(String[] args) {
        Employee employee01 = new Employee("Яковлева Ангелина Андреевна", "Специалист по тестированию", "testing@mail.ru", "+792345879632", 50000, 23);
        employee01.showInfo();
    }
}


