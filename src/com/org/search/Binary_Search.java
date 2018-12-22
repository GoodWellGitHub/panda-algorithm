package com.org.search;

import com.org.factory.ListUtil;

/**
 * Created by huajun.wang01 on 2018/12/15.
 */
public class Binary_Search {
    public static void main(String[] args) {
        Integer[] integers = ListUtil.createIntegerSortArray();
        System.out.println("非递归实现：" + index(integers, 4));
        System.out.println("##############");
        System.out.println("递归实现：" + indexRecursion(integers, 0, integers.length - 1, 4));
    }

    public static int index(Integer[] arr, Integer var) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (var.equals(arr[mid])) {
                return mid;
            } else if (var < arr[mid]) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return -1;
    }

    public static int indexRecursion(Integer[] arr, int start, int end, int var) {
        if (arr[start] > var || arr[end] < var || start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == var) {
            return mid;
        }
        if (var < arr[mid]) {
            return indexRecursion(arr, start, mid, var);
        }
        if (var > arr[mid]) {
            return indexRecursion(arr, mid, end, var);
        }
        return -1;
    }
}
