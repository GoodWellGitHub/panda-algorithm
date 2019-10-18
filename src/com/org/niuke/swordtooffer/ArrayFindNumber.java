package com.org.niuke.swordtooffer;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class ArrayFindNumber {
    public static boolean find(int target, int[][] array) {
        if (array == null) {
            return false;
        }
        int len = array.length - 1;
        int i = 0;
        while ((len >= 0) && (i < array[0].length)) {
            if (array[len][i] > target) {
                len--;
            } else if (array[len][i] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int target = 5;
        int[][] array = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        boolean result = find(target, array);
        System.out.println(result);

    }
}
