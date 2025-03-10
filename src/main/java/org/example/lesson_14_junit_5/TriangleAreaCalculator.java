package org.example.lesson_14_junit_5;

public class TriangleAreaCalculator {
    public static double calculateArea(double a, double b, double c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Стороны треугольника должны быть положительными");
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Стороны не могут образовывать треугольник");
        }

        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
