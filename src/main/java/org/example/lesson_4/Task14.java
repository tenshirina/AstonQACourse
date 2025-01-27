package org.example.lesson_4;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnArray(5, 8)));
    }

    public static int[] returnArray(int len, int initialValue) {
        int[] myArray = new int[len];

        for (int i = 0; i < len; i++) {
            myArray[i] = initialValue;
        }
        return myArray;
    }
}
