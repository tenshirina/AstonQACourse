package testng_tests;

import org.example.lesson_14_testng.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculateTest {

    private Calculator calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    @DataProvider(name = "addNumbers")
    public Object[][] addDataProvider() {
        return new Object[][]{
                {4, 3, 7},
                {-2, 10, 8},
                {0, -80, -80}
        };
    }

    @Test(dataProvider = "addNumbers", description = "Сложение двух целых чисел")
    public void testAddition(int a, int b, int expected) {
        Assert.assertEquals(calculator.add(a, b), expected, "Ошибка при сложении");
    }

    @DataProvider(name = "subtractNumbers")
    public Object[][] subtractDataProvider() {
        return new Object[][]{
                {20, 9, 11},
                {-2, -10, 8},
                {0, 80, -80}
        };
    }

    @Test(dataProvider = "subtractNumbers", description = "Вычитание двух целых чисел")
    public void testSubtraction(int a, int b, int expected) {
        Assert.assertEquals(calculator.subtract(a, b), expected, "Ошибка при вычитании");
    }

    @DataProvider(name = "multiplicationNumbers")
    public Object[][] multiplicationDataProvider() {
        return new Object[][]{
                {4, 5, 20},
                {-3, -2, 6},
                {0, 7, 0}
        };
    }

    @Test(dataProvider = "multiplicationNumbers", description = "Умножение двух целых чисел")
    public void testMultiplication(int a, int b, int expected) {
        Assert.assertEquals(calculator.multiply(a, b), expected, "Ошибка при умножении");
    }

    @DataProvider(name = "divisionNumbers")
    public Object[][] divisionDataProvider() {
        return new Object[][]{
                {6, 2, 3},
                {-12, -3, 4},
                {0, 13, 0}
        };
    }

    @Test(dataProvider = "divisionNumbers", description = "Деление двух целых чисел (положительная проверка)")
    public void testDivision(int a, int b, int expected) {
        Assert.assertEquals(calculator.divide(a, b), expected, "Ошибка при делении");
    }

    @Test(expectedExceptions = ArithmeticException.class, description = "Деление на ноль")
    public void testDivisionByZero() {
        calculator.divide(4, 0);
    }
}
