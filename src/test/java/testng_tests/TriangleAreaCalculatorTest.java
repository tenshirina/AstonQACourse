package testng_tests;

import org.example.lesson_14_testng.TriangleAreaCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleAreaCalculatorTest {

    @Test(description = "Площадь треугольника (стороны: 3, 4, 5)")
    public void testCalculateArea_validTriangle() {
        double result = TriangleAreaCalculator.calculateArea(3, 4, 5);
        Assert.assertEquals(result, 6.0, "Площадь треугольника должна быть 6.0");
    }

    @Test(description = "Равносторонний треугольник")
    public void testCalculateArea_equilateralTriangle() {
        double result = TriangleAreaCalculator.calculateArea(8, 8, 8);
        Assert.assertEquals(Math.round(result * 1000.0) / 1000.0, 27.713, 0.0001, "Площадь треугольника должна быть 27.713");
    }

    @Test(expectedExceptions = IllegalArgumentException.class, description = "Треугольник с несуществующими сторонами")
    public void testCalculateArea_invalidTriangle() {
        TriangleAreaCalculator.calculateArea(1, 2, 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class, description = "Треугольник с отрицательной стороной")
    public void testCalculateArea_negativeSides() {
        TriangleAreaCalculator.calculateArea(-6, 3, 4);
    }

    @Test(expectedExceptions = IllegalArgumentException.class, description = "Треугольник - сторона равна нулю")
    public void testCalculateArea_zeroSide() {
        TriangleAreaCalculator.calculateArea(3, 0, 5);
    }
}
