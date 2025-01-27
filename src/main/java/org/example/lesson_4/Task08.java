package org.example.lesson_4;

public class Task08 {
    public static void main(String[] args) {
        printString("Hi!", 5);
    }

    public static void printString(String s, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(s);
        }
    }
}
