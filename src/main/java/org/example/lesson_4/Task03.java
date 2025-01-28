package org.example.lesson_4;

public class Task03 {
    public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
        int value = 1;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if ((0 < value) & (value <= 100)) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
}
