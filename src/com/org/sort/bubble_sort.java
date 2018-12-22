package com.org.sort;

import com.org.factory.ListUtil;


/**
 * Created by huajun.wang01 on 2018/12/15.
 */
public class bubble_sort {
    public static void main(String[] args) {
        Integer[] arr = ListUtil.createUnorderedArray();
        for (int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("#########排序后###########");
        sort(arr);
        for (int a:arr){
            System.out.print(a+" ");
        }
    }

    public static void sort(Integer[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
