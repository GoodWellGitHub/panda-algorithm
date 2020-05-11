package com.org.leetcode;
import static java.lang.Math.*;
/**
 * 盛水最多容器
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 */
public class ShenZuiDuoShuiRongQi {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        int max1=solution1(arr);
        int max2=solution2(arr);

        System.out.println("result1 "+max1);
        System.out.println("result2 "+max2);

    }

    /**
     * 暴力求解 时间复杂度 O(n^2)
     *
     * @param
     * @return
     */
    public static int solution1(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int[] maxHeight = new int[height.length];
        for (int i = 1; i < height.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                int ara = min(height[i], height[j]) * (i - j);
                maxHeight[j] = max(ara, maxHeight[j]);
            }
        }

        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            maxArea = max(maxArea, maxHeight[i]);
        }
        return maxArea;
    }

    /**
     * 双指针法 时间复杂度O(n)
     *
     * @param arr
     * @return
     */
    public static int solution2(int[] arr) {
        int max = 0;
        int l=0;int r=arr.length-1;
        int lt=l;
        int rt=r;
        while (l<r){
            int temp=Math.min(arr[l],arr[r])*(r-l);
            max=max(temp,max);
            if (arr[l]<=arr[r]&&lt<rt){
                while (lt<rt&&arr[lt]<=arr[l]){
                    lt++;
                }
                l=lt;
            }else {
                while (rt>lt&&arr[rt]<=arr[r]){
                    rt--;
                }
                r=rt;
            }
        }
        return max;
    }
}
