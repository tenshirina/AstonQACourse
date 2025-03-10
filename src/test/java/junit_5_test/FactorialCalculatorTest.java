package junit_5_test;

import org.example.lesson_14_junit_5.FactorialCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FactorialCalculatorTest {

    @DisplayName("Факториал нуля")
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.factorial(0), "Факториал 0 должен быть 1");
    }

    @DisplayName("Факториал одного")
    @Test
    public void testFactorialOfOne() {
        assertEquals(1, FactorialCalculator.factorial(1), "Факториал 1 должен быть 1");
    }

    @DisplayName("Параметризация (положительные тесты)")
    @ParameterizedTest
    @CsvSource({
            "6, 3",
            "24, 4",
            "120, 5",
            "720, 6",
            "3628800, 10"
    })
    void testFactorial(long expected, int input) {
        assertEquals(expected, FactorialCalculator.factorial(input));
    }

    @DisplayName("Факториал отрицательного числа")
    @Test
    public void testFactorialNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.factorial(-8);
        });

        assertEquals("Число должно быть неотрицательным", exception.getMessage());
    }
}