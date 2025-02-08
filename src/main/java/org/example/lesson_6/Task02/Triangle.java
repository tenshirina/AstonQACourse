package org.example.lesson_6.Task02;

public class Triangle implements Shape {
    private double baseSide;
    private double sideB;
    private double sideC;
    private double height;
    private String triangleBorderColor;
    private String triangleBackgroundColor;

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
