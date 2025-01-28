package org.example.lesson_4;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 1, 1, 0, 0, 1};
        changeNumbers(array);
    }

    public static void changeNumbers(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                myArray[i] = 1;
            } else {
                myArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
