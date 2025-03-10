package junit_5_test;

import org.example.lesson_14_junit_5.NumberComparator;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumberComparatorTest {

    @DisplayName("Сравнение целых чисел")
    @ParameterizedTest
    @CsvSource({
            "7, 4, 1",
            "-10, 20, -1",
            "15, 15, 0"
    })

    public void testCompare(int a, int b, int expected) {
        assertEquals(expected, NumberComparator.compare(a, b));
    }
}
