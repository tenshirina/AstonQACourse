package org.example.lesson_6.Task02;

public class Rectangle implements Shape {
    private double width;
    private double height;
    private String rectangleBorderColor;
    private String rectangleBackgroundColor;

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
