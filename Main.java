package com.keller;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] array = new int[5][2];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        display2DArray(array);
        sort2DArrayByColumns(array);
        display2DArray(array);

    }

    public static void display2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            System.out.print("row " + i + ": ");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 10) {
                    System.out.print("  " + array[i][j] + " ");
                } else if (array[i][j] < 100){
                    System.out.print(" " + array[i][j] + " ");
                } else {
                    System.out.print("" + array[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void sort2DArrayByRow(int[][] array) {
        System.out.println("Starting Row Sort...");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int minIndex = array[i].length - 1;
                for (int c = j; c < array[i].length; c++) {
                    if (array[i][minIndex] > array[i][c]) {
                        minIndex = c;
                    }
                }
                int temp = array[i][j];
                array[i][j] = array[i][minIndex];
                array[i][minIndex] = temp;
            }
        }
    }

    public static void sort2DArrayByColumns(int[][] array) {
        System.out.println("Starting Column Sort...");
        for (int i = 0; i < array[i].length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                int minIndex = array.length - 1;
                for (int c = j; c < array.length; c++) {
                    if (array[j][minIndex] > array[j][c]) {
                        minIndex = c;
                    }
                }
                int temp = array[j][i];
                array[j][i] = array[j][minIndex];
                array[j][minIndex] = temp;
            }
        }
    }

    public static void sort2DArray(int[][] array) {

    }

}
