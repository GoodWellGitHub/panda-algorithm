package com.org.data.datastruandalgorith.recursion;

/**
 * 输出n个bool量所有组合，每个bool量有1和0两种组合
 */
public class BoolCombination {
    public static void main(String[] args) {
        BoolCombination combination = new BoolCombination();
        int n = 20;
        byte[] arr = new byte[n];
        combination.solution(arr, n);
    }

    public void solution(byte[] arr, int n) {
        if (n == 1) {
            arr[0] = 0;
            outCombination(arr);
            arr[0] = 1;
            outCombination(arr);
            return;
        }
        arr[n - 1] = 0;
        solution(arr, n - 1);
        arr[n - 1] = 1;
        solution(arr, n - 1);
    }

    public void outCombination(byte[] arr) {
        for (byte value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
