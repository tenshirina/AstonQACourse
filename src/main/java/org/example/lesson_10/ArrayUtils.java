package org.example.lesson_10;

public class ArrayUtils {
    public void checkArrayLength(int length) {
        if (length != 4) {
            throw new MyArraySizeException("Массив не может быть такого размера!");
        }
    }

    public int checkIntegerFormat(String element, int i, int j) {
        try {
            return Integer.parseInt(element);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Некорректные данные в ячейке [" + i + "][" + j + "]");
        }
    }
}
