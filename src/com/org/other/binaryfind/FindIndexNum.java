<<<<<<< HEAD
package com.org.other.binaryfind;

/**
 * 在 未排序 的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 */
public class FindIndexNum {
    public static void main(String[] args) {
        int[] arr={4,2,19,98,12,2,1,0};
        int larget=8;
        int result=findIndex(arr,0,arr.length-1,larget);
        System.out.println("第"+larget+"大的数"+result);
    }

    public static int findIndex(int[] arr, int start, int end, int largeIndex) {
        if (largeIndex<0||largeIndex>arr.length||start>end){
            return -1;
        }
        int partion = partion(arr, start, end);
        if (largeIndex == partion + 1) {
            return arr[partion+1];
        }

        if (largeIndex > partion+1) {
            return findIndex(arr, partion + 1, end, largeIndex);
        } else {
            return findIndex(arr, 0, partion-1, largeIndex);
        }
    }

    public static int partion(int[] arr, int start, int end) {
        int tempCompare = arr[end];
        int endIndex = end;
        while (start < end) {
            while (arr[start] >= tempCompare&&start<end) {
                start++;
            }
            while (arr[end] < tempCompare&&start<end) {
                end--;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        arr[endIndex] = arr[start];
        arr[start] = tempCompare;
        return start;
    }

}
=======
package com.org.other.binaryfind;

/**
 * 在 未排序 的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 */
public class FindIndexNum {
    public static void main(String[] args) {
        int[] arr = {4, 2, 19, 98, 12, 2, 1, 0};
        int larget = 4;
        int result = findIndex(arr, 0, arr.length - 1, larget);
        System.out.println("第" + larget + "大的数" + result);
    }

    public static int findIndex(int[] arr, int start, int end, int largeIndex) {
        if (largeIndex < 0 || largeIndex > arr.length || start > end) {
            return -1;
        }
        int end1=end;
        int partion = partion(arr, start, end);
        if (largeIndex == partion + 1) {
            return arr[partion + 1];
        }

        if (largeIndex > partion + 1) {
            return findIndex(arr, partion + 1, end1, largeIndex);
        } else {
            return findIndex(arr, 0, partion - 1, largeIndex);
        }
    }

    public static int partion(int[] arr, int start, int end) {
        int tempCompare = arr[end];
        int endIndex = end;
        while (start < end) {
            while (arr[start] > tempCompare && start < end) {
                start++;
            }
            while (arr[end] <= tempCompare && start < end) {
                end--;
            }
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

        }
        arr[endIndex] = arr[start];
        arr[start] = tempCompare;
        return start;
    }

}
>>>>>>> 70a0aec4f2394519fba93383ef82731f766dbf1d
