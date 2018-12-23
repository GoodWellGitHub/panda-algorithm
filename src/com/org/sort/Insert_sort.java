package com.org.sort;

import com.org.factory.ListUtil;

/**
 * Created by huajun.wang01 on 2018/12/23.
 */
public class Insert_sort {
    public static void main(String[] args) {
        Integer[] arr = ListUtil.createUnorderedArray();
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("\n--------插入排序后----------");
        Insert_sort insertSort = new Insert_sort();
        insertSort.insertSort(arr);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public void insertSort(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    private void swap(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
