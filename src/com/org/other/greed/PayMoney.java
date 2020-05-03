package com.org.other.greed;

import java.util.HashMap;
import java.util.Map;

/**
 * 小明手中有 1，5，10，50，100 五种面额的纸币，
 * 每种纸币对应张数分别为 5，2，2，3，5 张。
 * 若小明需要支付 456 元，则需要多少张纸币？
 * <p>
 * （1）建立数学模型
 *   设小明每次选择纸币面额为 Xi ，需要的纸币张数为 n 张，剩余待支付金额为 V ，则有：
 * X1 + X2 + … + Xn = 456.
 * （2）问题拆分为子问题
 *   小明选择纸币进行支付的过程，可以划分为n个子问题：即每个子问题对应为：
 * 在未超过456的前提下，在剩余的纸币中选择一张纸币。
 * （3）制定贪心策略，求解子问题
 */
public class PayMoney {
    public static void main(String[] args) {
        int Count[] = {5, 2, 2, 3, 5};//每一张纸币的数量
        int Value[] = {1, 5, 10, 50, 100};
        HashMap<Integer, Integer> use = solution(Count, Value, 456);
        if (use == null) {
            System.out.println("不能组合此金额");
        } else {
            System.out.println("组成此金额的组合为: ");
            int count = 0;
            for (Map.Entry entry : use.entrySet()) {
                count += (int) entry.getValue();
                System.out.println("金额: " + entry.getKey() + "  数量: " + entry.getValue());
            }
            System.out.println("总数量为： "+count);
        }
    }

    /**
     * @param count 每一张纸币的数量
     * @param value 纸币的面额
     * @return
     */
    public static HashMap<Integer, Integer> solution(int[] count, int[] value, int target) {
        HashMap<Integer, Integer> use = new HashMap<>();
        int index = value.length - 1;
        for (; index >= 0; index--) {
            int temp = target / value[index];
            if (temp <= count[index]) {
                target = target - temp * value[index];
                use.put(value[index], temp);
            } else {
                target = target - count[index] * value[index];
                use.put(value[index], count[index]);
            }
            if (target <= 0) {
                break;
            }
        }
        if (target == 0) {
            return use;
        }
        return null;
    }
}
