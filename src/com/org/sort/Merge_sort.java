package com.org.sort;

import com.org.factory.ListUtil;

/**
 * Created by huajun.wang01 on 2018/12/16.
 */
public class Merge_sort {
    public static void main(String[] args) {
        Integer[] arr = ListUtil.createUnorderedArray();
        for (int a : arr) {
            System.out.print(a + "  ");
        }
        sort(arr);
        System.out.println();
        System.out.println("#############");
        for (int a : arr) {
            System.out.print(a + "  ");
        }
    }

    public static void sort(Integer[] arr) {
        int[] temp = new int[arr.length];
        sort(arr, 0, arr.length - 1, temp);
    }

    private static void sort(Integer[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(arr, left, mid, temp);
            sort(arr, mid + 1, right, temp);
            merge(arr, left, right, mid, temp);
        }
    }

    private static void merge(Integer[] arr, int left, int right, int mid, int[] temp) {
        int i = left;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[t] = arr[i];
                t++;
                i++;
            } else {
                temp[t++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[t++] = arr[i++];
        }
        while (j <= right) {
            temp[t++] = arr[j++];
        }
        t = 0;
        while (left <= right) {
            arr[left++] = temp[t++];
        }
    }
}
