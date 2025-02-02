package org.example.lesson_6;

interface Shape {
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

class Circle implements Shape {
    double radius;
    String circleBorderColor;
    String circleBackgroundColor;

    public Circle(double radius, String circleBorderColor, String circleBackgroundColor) {
        this.radius = radius;
        this.circleBorderColor = circleBorderColor;
        this.circleBackgroundColor = circleBackgroundColor;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String getColorBorder() {
        return circleBorderColor;
    }

    public String getColorBackground() {
        return circleBackgroundColor;
    }
}

class Rectangle implements Shape {
    double width;
    double height;
    String rectangleBorderColor;
    String rectangleBackgroundColor;

    public Rectangle(double width, double height, String rectangleBorderColor, String rectangleBackgroundColor) {
        this.width = width;
        this.height = height;
        this.rectangleBorderColor = rectangleBorderColor;
        this.rectangleBackgroundColor = rectangleBackgroundColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public String getColorBorder() {
        return rectangleBorderColor;
    }

    public String getColorBackground() {
        return rectangleBackgroundColor;
    }
}

class Triangle implements Shape {
    double baseSide;
    double sideB;
    double sideC;
    double height;
    String triangleBorderColor;
    String triangleBackgroundColor;

    public Triangle(double baseSide, double sideB, double sideC, double height, String triangleBorderColor, String triangleBackgroundColor) {
        this.baseSide = baseSide;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
        this.triangleBorderColor = triangleBorderColor;
        this.triangleBackgroundColor = triangleBackgroundColor;
    }

    @Override
    public double getPerimeter() {
        return baseSide + sideB + sideC;
    }

    @Override
    public double getArea() {
        return baseSide * height * 0.5;
    }

    public String getColorBorder() {
        return triangleBorderColor;
    }

    public String getColorBackground() {
        return triangleBackgroundColor;
    }
}

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
