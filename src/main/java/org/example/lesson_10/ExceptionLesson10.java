package org.example.lesson_10;

public class ExceptionLesson10 {
    public static void main(String[] args) {
        String[][] myArray = {
                {"1", "2", "3", "4"},    // Первая строка
                {"4", "5", "6", "7"},    // Вторая строка
                {"7", "8", "9", "10"},    // Третья строка
                {"10", "11", "12", "13"}
        };

        ArrayUtils util = new ArrayUtils();
        ArrayProcessor processor = new ArrayProcessor(util);

        processor.printSum(myArray);
    }
}

