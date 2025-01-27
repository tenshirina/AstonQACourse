package org.example.lesson_4;

public class Task09 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1992));
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
