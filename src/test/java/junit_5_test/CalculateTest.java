package junit_5_test;

import org.example.lesson_14_junit_5.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculateTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @DisplayName("Сложение двух целых чисел")
    @ParameterizedTest
    @CsvSource({
            "3, 4, 7",
            "-2, 10, 8",
            "0, -80, -80"
    })
    public void testAddition(int a, int b, int expected) {
        assertEquals(expected, calculator.add(a, b));
    }

    @DisplayName("Вычитание двух целых чисел")
    @ParameterizedTest
    @CsvSource({
            "20, 9, 11",
            "-2, -10, 8",
            "0, 80, -80"
    })

    public void testSubtraction(int a, int b, int expected) {
        assertEquals(expected, calculator.subtract(a, b));
    }

    @DisplayName("Умножение двух целых чиел")
    @ParameterizedTest
    @CsvSource({
            "4, 5, 20",
            "-3, -2, 6",
            "0, 7, 0"
    })

    public void testMultiplication(int a, int b, int expected) {
        assertEquals(expected, calculator.multiply(a, b));
    }

    @DisplayName("Деление двух целых чисел(положительные проверки)")
    @ParameterizedTest
    @CsvSource({
            "6, 2, 3",
            "-12, -3, 4",
            "0, 13, 0"
    })

    public void testDivision(int a, int b, int expected) {
        assertEquals(expected, calculator.divide(a, b));
    }

    @DisplayName("Деление на ноль")
    @Test

    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(4, 0);
        });

        assertEquals("Нельзя делить на ноль", exception.getMessage());
    }
}
