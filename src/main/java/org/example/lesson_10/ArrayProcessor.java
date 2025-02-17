package org.example.lesson_10;

public class ArrayProcessor {
    private ArrayUtils utils;

    public ArrayProcessor(ArrayUtils utils) {
        this.utils = utils;
    }

    public void printSum(String[][] array) {
        int sum = 0;

        try {
            utils.checkArrayLength(array.length);

            for (int i = 0; i < array.length; i++) {
                utils.checkArrayLength(array[i].length);

                for (int j = 0; j < array[i].length; j++) {
                    sum += utils.checkIntegerFormat(array[i][j], i, j);
                }
            }
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Исключение типа: " + e);
        } finally {
            System.out.println("Сумма элементов: " + sum);
        }
    }
}
