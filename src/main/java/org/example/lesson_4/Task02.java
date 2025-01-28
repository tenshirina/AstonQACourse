package org.example.lesson_4;

public class Task02 {
    public static void main(String[] args) {
        checkSumSigh();
    }

    public static void checkSumSigh() {
        int a = 6;
        int b = 15;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
