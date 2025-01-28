package org.example.lesson_4;

public class Task06 {
    public static void main(String[] args) {
        printNumSign(0);
    }

    public static void printNumSign(int number) {
        if (number >= 0) {
            System.out.println(number + ": положительное число");
        } else {
            System.out.println(number + ": отрицательное число");
        }
    }
}
