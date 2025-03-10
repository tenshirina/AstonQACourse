package junit_5_test;

import org.example.lesson_14_junit_5.TriangleAreaCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleAreaCalculatorTest {
    @DisplayName("Площадь треугольника (стороны: 3, 4, 5)")
    @Test
    public void testCalculateArea_validTriangle() {
        double area = TriangleAreaCalculator.calculateArea(3, 4, 5);
        assertEquals(6.0, area);
    }

    @DisplayName("Треугольник с несуществующими сторонами")
    @Test
    public void testCalculateArea_invalidTriangle() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            TriangleAreaCalculator.calculateArea(1, 2, 1);
        });

        assertEquals("Стороны не могут образовывать треугольник", exception.getMessage());
    }

    @DisplayName("Треугольник с отрицательной стороной")
    @Test
    public void testCalculateArea_negativeSides() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            TriangleAreaCalculator.calculateArea(-6, 3, 4);
        });

        assertEquals("Стороны треугольника должны быть положительными", exception.getMessage());
    }

    @DisplayName("Треугольник - сторона равна нулю")
    @Test
    public void testCalculateArea_zeroSide() {
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleAreaCalculator.calculateArea(3, 0, 5);
        });
    }

    @DisplayName("Равносторонний треугольник")
    @Test
    public void testCalculateArea_equilateralTriangle() {
        double area = TriangleAreaCalculator.calculateArea(8, 8, 8);
        assertEquals(27.713, Math.round(area * 1000.0) / 1000.0, 0.0001);
    }
}

