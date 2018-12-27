package com.org.problem;

import java.util.LinkedList;

/**
 * 有一个整数数组和一个大小为w的窗口从数组的最左边滑到最右边，窗口每次向右滑一个位置
 * 求出每次窗口的最大值（时间复杂度O（n））
 * 方法：使用双端队列
 */
public class ArrMaxWindow_Queue {
    public int[] getMaxWindow(int[] arr, int w) {
        if (arr == null || w < 0 || arr.length < w) {
            return null;
        }
        int[] res = new int[arr.length - w + 1];
        int indx = 0;
        LinkedList<Integer> qmax = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            while (!qmax.isEmpty() && arr[i] >= arr[qmax.peekLast()]) {
                qmax.pollLast();
            }
            qmax.addLast(i);
            if (qmax.peekFirst() == i - w) {
                qmax.pollLast();
            }
            if (i >= w - 1) {
                res[indx++] = arr[qmax.peekFirst()];
            }
        }
        return res;
    }
}
