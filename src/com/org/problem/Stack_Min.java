package com.org.problem;

import java.util.Stack;

/**
 * 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作
 * 思路：使用两个栈，一个用来保存栈中的元素，另一个用来存储最小值
 */
public class Stack_Min {
    private Stack<Integer> stackDate;
    private Stack<Integer> stackMin;

    public Stack_Min() {
        this.stackDate = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int newNum) {
        if (this.stackMin.isEmpty()) {
            stackMin.push(newNum);
        } else if (getMin() >= newNum) {
            this.stackMin.push(newNum);
        }
        this.stackDate.push(newNum);
    }

    public int pop() {
        if (this.stackDate.isEmpty()) {
            throw new RuntimeException("statck is empty");
        }
        int value = this.stackDate.pop();
        if (value == getMin()) {
            stackMin.pop();
        }
        return value;
    }

    public int getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException("minstack is empty");
        }
        return this.stackMin.peek();
    }
}
