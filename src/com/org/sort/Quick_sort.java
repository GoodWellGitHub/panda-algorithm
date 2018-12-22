package com.org.sort;

import com.org.factory.ListUtil;

/**
 * Created by huajun.wang01 on 2018/12/15.
 */
public class Quick_sort {
    public static void main(String[] args) {
        Integer[] arr = ListUtil.createUnorderedArray();
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println("#####排序后########");
        quickSort(arr, 0, arr.length - 1);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void quickSort(Integer[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int part = part(arr, start, end);
        quickSort(arr, start, part - 1);
        quickSort(arr, part + 1, end);
    }

    public static int part(Integer[] arr, int start, int end) {
        int x = arr[end];
        int left = start;
        int right = end - 1;
        while (left < right) {
            while (left < right && arr[left] <= x) {
                left++;
            }
            while (left < right && arr[right] > x) {
                right--;
            }
            swap(arr, left, right);
        }
        swap(arr, left, end);
        return left;
    }

    public static void swap(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
