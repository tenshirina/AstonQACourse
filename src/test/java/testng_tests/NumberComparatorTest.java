package testng_tests;

import org.example.lesson_14_testng.NumberComparator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NumberComparatorTest {
    @DataProvider(name = "comparisonNumbers")
    public Object[][] comparatorDataProvider() {
        return new Object[][]{
                {7, 4, 1},
                {-10, 20, -1},
                {15, 15, 0}
        };
    }

    @Test(dataProvider = "comparisonNumbers", description = "Сравнение двух целых чисел")
    public void testCompare(int a, int b, int expected) {
        Assert.assertEquals(NumberComparator.compare(a, b), expected, "Значения невозможно сравнить");
    }
}
