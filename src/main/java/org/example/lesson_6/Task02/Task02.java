package org.example.lesson_6.Task02;

public class Task02 {
    public static void main(String[] args) {
        Circle circle = new Circle(30, "Красный", "Белый");
        Rectangle rectangle = new Rectangle(3, 4, "Зеленый", "Желтый");
        Triangle triangle = new Triangle(5, 7, 10, 9, "Черный", "Фиолетовый");

        System.out.print("Круг -");
        circle.showInfo();
        System.out.print("Прямоугольник -");
        rectangle.showInfo();
        System.out.print("Треугольник -");
        triangle.showInfo();
    }
}
