package com.org.other.binaryfind;

/**
 * 寻找一个数
 */
public class BinaryFindNum {
    public static void main(String[] args) {
        int[] arr = InitCreate.sort1Arr();
        InitCreate.printArr(arr);
        int index = new BinaryFindNum().targetRightIndex(arr, 5);
        System.out.println("result: " + index);
    }

    int targetIndex(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }


    int targetLeftIndex(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                right = mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
        }
        if (arr[right] == target) {
            return right;
        }

        return -1;
    }

    int targetRightIndex(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            }
        }
        return arr[left - 1]==target?left-1:-1;

    }
}