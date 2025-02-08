package org.example.lesson_6.Task02;

public class Circle implements Shape {
    private double radius;
    private String circleBorderColor;
    private String circleBackgroundColor;

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
