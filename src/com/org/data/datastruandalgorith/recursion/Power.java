package com.org.data.datastruandalgorith.recursion;

/**
 *
 * 计算以x为底的n次幂
 * 时间复杂度 logn
 */
public class Power {
    public static void main(String[] args) {
        Power power = new Power();
        int result = power.solution(3, 3);
        System.out.println(result);
    }

    public int solution(int x, int n) {
        if (n == 0)
            return 1;
        int y;
        y = solution(x, n / 2);
        y = y * y;
        if (n % 2 == 1)
            y = y * x;
        return y;
    }
}
