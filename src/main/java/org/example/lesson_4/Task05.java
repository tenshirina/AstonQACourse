package org.example.lesson_4;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число: ");
        int first = scanner.nextInt();

        System.out.println("Введите второе целое число: ");
        int second = scanner.nextInt();

        System.out.println(checkSum(first, second));
    }

    public static boolean checkSum(int a, int b) {
        return a + b >= 10 & a + b <= 20;
    }
}
