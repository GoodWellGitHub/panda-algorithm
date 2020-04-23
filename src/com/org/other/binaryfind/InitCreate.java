package com.org.other.binaryfind;

import java.util.Random;

public class InitCreate {

    public static int[] lengthIntArr(int length) {
        Random r = new Random(1);
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static int[] sortArr(int length) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + i / 2;
        }
        return arr;
    }

    public static int[] sort1Arr() {
        int[] arr = {1, 1, 3, 4, 5, 5, 5, 7, 8, 8, 10, 365};
        return arr;
    }
}
