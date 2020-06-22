package com.org.niuke;

/**
 * 题目描述
 * 牛牛有两个长度为nn的数组a, ba,b，牛牛希望统计有多少数对(l, r)(l,r)满足：
 * 1，0 \leq l \leq r \leq n - 10≤l≤r≤n−1
 * 2，\sum_{i= l}^{r}{a_i} = b_l + b_r∑
 * i=l
 * r
 * ​
 * a
 * i
 * ​
 * =b
 * l
 * ​
 * +b
 * r
 * ​
 * <p>
 * 示例1
 * 输入
 * 复制
 * [1,2,3,4],[2,1,4,5]
 * 输出
 * 复制
 * 4
 * 说明
 * 满足条件的数对有(0, 1), (0, 2), (1, 1), (1, 2)(0,1),(0,2),(1,1),(1,2)
 * 示例2
 * 输入
 * 复制
 * [0,0,1,1,1],[2,0,4,3,3]
 * 输出
 * 复制
 * 2
 * 备注:
 * a.size() == b.size()a.size()==b.size()
 * 1 \leq a.size() \leq 10^41≤a.size()≤10
 * 4
 * <p>
 * \left| a_i \right| \leq 1000∣a
 * i
 * ​
 * ∣≤1000
 * \left| b_i \right| \leq 10^8∣b
 * i
 * ​
 * ∣≤10
 * 8
 */
public class NumsSumCount {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 1, 4, 5};
        int result1 = solution1(a, b);
        System.out.println("result1 ： " + result1);

    }

    /**
     * 暴力求解，两遍for循环
     *
     * @return
     */
    public static int solution1(int[] a, int[] b) {
        // write code here
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum = sum + a[j];
                if (sum == b[i] + b[j]) {
                    count = count + 1;
                }
            }
        }
        return count;
    }

}
