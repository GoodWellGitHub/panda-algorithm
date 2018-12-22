package com.org.sort;

import com.org.factory.ListUtil;

/**
 * 选择排序
 */
public class Chose_sort {
    public static void main(String[] args) {
        Integer[] arr = ListUtil.createUnorderedArray();
        for (int value : arr) {
            System.out.print(value + " ");
        }
        Chose_sort chose_sort = new Chose_sort();
        chose_sort.sort(arr);
        System.out.println("\n------排序后------");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public void sort(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[temp]) {
                    temp = j;
                }
            }
            if (temp != i) {
                swap(arr, i, temp);
            }
        }
    }

    private void swap(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
