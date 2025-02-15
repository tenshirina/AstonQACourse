package org.example.lesson_10;

class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class ExceptionLesson10 {
    public static void checkArrayLength(int length) {
        if (length != 4) {
            throw new MyArraySizeException("Массив не может быть такого размера!");
        }
    }

    public static int checkIntegerFormat(String element, int i, int j) {
        try {
            return Integer.parseInt(element);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Некорректные данные в ячейке [" + i + "][" + j + "]");
        }
    }

    public static void printSum(String[][] array) {
        int sum = 0;

        try {
            checkArrayLength(array.length);

            for (int i = 0; i < array.length; i++) {
                checkArrayLength(array[i].length);

                for (int j = 0; j < array[i].length; j++) {
                    sum += checkIntegerFormat(array[i][j], i, j);
                }
            }
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Исключение типа: " + e);
        } finally {
            System.out.println("Сумма элементов: " + sum);
        }
    }

    public static void main(String[] args) {
        String[][] myArray = {
                {"1", "2", "3", "k"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        printSum(myArray);
    }
}

