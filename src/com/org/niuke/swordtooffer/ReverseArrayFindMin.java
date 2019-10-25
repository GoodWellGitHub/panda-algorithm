package com.org.niuke.swordtooffer;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class ReverseArrayFindMin {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        ReverseArrayFindMin findMin = new ReverseArrayFindMin();
        int result = findMin.minNumberInRotateArray(arr);
        System.out.println(result);
    }

    public int minNumberInRotateArray(int[] array) {
        int length = array.length;
        if (length == 0 || array == null) {
            return 0;
        }
        if (length == 1) {
            return array[0];
        }

        int result = result(array, 0, array.length - 1);

        return result;
    }

    int result(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        if (left + 1 == right) {
            return arr[left] > arr[right] ? arr[right] : arr[left];
        }
        int mid = (left + right) / 2;
        if (arr[mid] < arr[right]) {
            right = mid;
            return result(arr, left, right);
        } else {
            left = mid;
            return result(arr, left, right);
        }
    }
}
