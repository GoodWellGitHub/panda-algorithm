package com.org.other.stackQueue;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列 1，2，3，4，5 是某栈的压入顺序，
 * 序列 4，5，3，2，1是该压栈序列对应的一个弹出序列，
 * 但4，3，5，1，2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */
public class FindOutStackOrder {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};
        int target1[] = {4, 5, 3, 2, 1};
        int[] target2 = {4, 3, 5, 1, 2};
        System.out.println(isRightOrder(source, target1));
        System.out.println(isRightOrder(source, target2));
    }

    public static boolean isRightOrder(int[] source, int[] out) {
        int length = source.length;
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        int i = 0;
        while (i < source.length) {
            if (source[i] == out[j]) {
                i++;
                j++;
            } else {
                stack.push(source[i]);
                i++;
            }
            while (!stack.isEmpty()) {
                if (stack.peek() == out[j]) {
                    stack.pop();
                    j++;
                } else {
                    break;
                }
            }

        }
        return stack.isEmpty();
    }
}
