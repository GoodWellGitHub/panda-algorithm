package com.org.sort;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeReverseNums {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {6, 202, 100, 301, 38, 8, 1};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int temp[] = new int[arr.length];
        gb(0, arr.length - 1, arr, temp);
        System.out.println(count);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void gb(int l, int r, int arr[], int temp[]) {
        if (l >= r) {
            return;
        } else {
            int mid = l + (r - l) / 2;
            int p = -1;
            gb(l, mid, arr, temp);
            gb(mid + 1, r, arr, temp);
            int i = l;
            int j = mid + 1;
            while (j <= r && i <= mid) {
                if (arr[i] <= arr[j]) {
                    temp[++p] = arr[i];
                    i++;
                } else {
                    temp[++p] = arr[j];
                    j++;
                    count++;
                }
            }
            while (i <= mid) {
                temp[++p] = arr[i];
                i++;
            }
            while (j <= r) {
                temp[++p] = arr[j];
                j++;
            }
            for (int k = i; k <=l; k++) {
                arr[k] = temp[k-i];
            }
        }
    }
}
