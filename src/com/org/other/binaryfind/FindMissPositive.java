package com.org.other.binaryfind;

/**
 * 给定一个未排序的整数数组，找出其中没有出现的最小的正整数。
 * 示例 1:
 * <p>
 * 输入: [1,2,0]
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: [3,4,-1,1]
 * 输出: 2
 * 示例 3:
 * <p>
 * 输入: [7,8,9,11,12]
 * 输出: 1
 */
public class FindMissPositive {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        int[] arr1={3,4,-1,1};
        int[] arr2={1,2,0};
        System.out.println(findMiss(arr));
        System.out.println(findMiss(arr1));
        System.out.println(findMiss(arr2));
    }

    public static int findMiss(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 1;
        }
        int i = 0;
        while (i < arr.length) {
            if (arr[i] <= 0 || arr[i] > arr.length || arr[arr[i] - 1] == arr[i]) {
                i++;
            }else {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
        int j = 0;
        while (j < arr.length) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
            j++;
        }
        return j + 1;
    }
}
