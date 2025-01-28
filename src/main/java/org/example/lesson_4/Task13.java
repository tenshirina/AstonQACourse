package org.example.lesson_4;

public class Task13 {
    public static void main(String[] args) {

        int[][] myArray = new int[4][4];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (i == j || i + j == myArray.length - 1) {
                    myArray[i][j] = 1;
                } else {
                    myArray[i][j] = 0;
                }
            }
        }

        for (int m = 0; m < myArray.length; m++) {
            for (int n = 0; n < myArray.length; n++) {
                System.out.print(" " + myArray[m][n] + " ");
            }
            System.out.println();
        }
    }
}
