package com.org.other.link;

/**
 * 数组去重
 * 给定一个排序数组，你需要在原地删除重复的元素，使得每个元素只出现一次，返回移除后的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用o(1)额外空间的条件下完成
 * <p>
 * 示例1  给定数组nums=[1,1,2]
 * 函数返回新长度2，并且原数组nums的前两个元素被修改为1,2，不需要中考虑数组超出新长度后面的元素
 */
public class DeweightArr {
    public static void main(String[] args) {
        DeweightArr deweightArr = new DeweightArr();
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] arr1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(deweightArr.deweight1(arr));
        System.out.println(deweightArr.deweight2(arr1));
    }


    /**
     * 本地删除
     *
     * @param arr
     * @return
     */
    public int deweight1(int[] arr) {
        if (arr.length == 1) {
            return 1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == -1) {
                return i;
            }
            while (arr[i] == arr[i - 1]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = -1;
            }

        }
        return arr.length;
    }

    int deweight2(int[] arr) {
        if (arr.length == 1 || arr.length == 0) {
            return arr.length;
        }
        int low = 0;
        int fast = 1;
        while (fast < arr.length) {
            if (arr[fast] != arr[low]) {
                low = low + 1;
                arr[low] = arr[fast];
            }
            fast++;
        }
        return low + 1;
    }

}