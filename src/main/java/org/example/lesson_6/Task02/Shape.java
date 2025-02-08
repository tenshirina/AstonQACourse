package org.example.lesson_6.Task02;

public interface Shape {
    default double getPerimeter() {
        return 0;
    }

    default double getArea() {
        return 0;
    }

    String getColorBorder();

    String getColorBackground();

    default void showInfo() {
        System.out.println(" Периметр: " + getPerimeter() + " Площадь: " + getArea() + " Цвет границы: " + getColorBorder() + " Цвет заливки: " + getColorBackground());
    }
}
