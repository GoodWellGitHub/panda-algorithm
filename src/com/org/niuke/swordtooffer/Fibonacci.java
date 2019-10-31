package com.org.niuke.swordtooffer;


import java.util.HashMap;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Fibonacci {
    HashMap<Integer, Integer> hashInt = new HashMap();

    public int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            // return Fibonacci(n - 1) + Fibonacci(n - 2);
            Integer result = hashInt.get(n);
            if (result != null) {
                return result;
            }
            result = Fibonacci(n - 1) + Fibonacci(n - 2);
            hashInt.put(n, result);
            return result;
        }
    }
}
