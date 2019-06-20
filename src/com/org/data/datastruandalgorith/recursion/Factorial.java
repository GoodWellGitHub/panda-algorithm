package com.org.data.datastruandalgorith.recursion;
/*
计算一个数n的阶乘
 */
public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int result = factorial.solution(5);
        System.out.println(result);
    }

    public int solution(int n) {
        if (n == 0) {
            return 1;
        }
        return solution(n - 1) * n;
    }
}
