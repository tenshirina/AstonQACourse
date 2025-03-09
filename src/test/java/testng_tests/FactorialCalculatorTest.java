package testng_tests;

import org.example.lesson_14_testng.FactorialCalculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {

    @Test(description = "Факториал 0")
    public void testFactorialOfZero() {
        long result = FactorialCalculator.factorial(0);
        Assert.assertEquals(result, 1, "Факториал 0 должен быть 1");
    }

    @Test(description = "Факториал 1")
    public void testFactorialOfOne() {
        long result = FactorialCalculator.factorial(1);
        Assert.assertEquals(result, 1, "Факториал 1 должен быть 1");
    }

    @Test(expectedExceptions = IllegalArgumentException.class, description = "Факториал отрицательного числа")
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator.factorial(-1);
    }

    @Test(description = "Факториал большого числа")
    public void testFactorialOfLargeNumber() {
        long result = FactorialCalculator.factorial(10);
        Assert.assertEquals(result, 3628800, "Факториал 10 должен быть 3 628 800");
    }

    @DataProvider(name = "factorialData")
    public Object[][] factorialDataProvider() {
        return new Object[][]{
                {2, 2},
                {3, 6},
                {4, 24},
                {6, 720},
                {7, 5040}
        };
    }

    @Test(dataProvider = "factorialData", description = "Факториал парметризация (положительные тесты)")
    public void testFactorialWithDataProvider(int input, long expected) {
        Assert.assertEquals(FactorialCalculator.factorial(input), expected, "Ошибка в вычислении факториала");
    }
}
