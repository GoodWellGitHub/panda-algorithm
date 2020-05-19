package com.org.leetcode;

import com.org.util.ArrayUtil;

/**
 * 旋转数组
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 * <p>
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * 说明:
 * <p>
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的 原地 算法。
 */
public class ReverseKArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};int k=3;
        ArrayUtil.traceArr(arr);
        reverse(arr,arr.length-k);
        ArrayUtil.traceArr(arr);

        int[] arr1={-1,-100,3,99};int k1=2;
        ArrayUtil.traceArr(arr1);
        reverse(arr1,arr1.length-k1);
        ArrayUtil.traceArr(arr1);
    }

    public static void reverse(int[] arr,int k){
        int left=0;
        int right=k-1;
        while (left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        left=k;
        right=arr.length-1;
        while (left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        left=0;
        right=arr.length-1;
        while (left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

    }
}
