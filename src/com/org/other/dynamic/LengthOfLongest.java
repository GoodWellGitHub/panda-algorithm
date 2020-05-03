package com.org.other.dynamic;

/**
 * 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class LengthOfLongest {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        if (arr.length == 0) {
            return 0;
        }
        int[] dp = new int[arr.length];
        dp[0] = 1;
        int max = 1;
        for (int i = 1; i < arr.length; i++) {
            int before = dp[i - 1];
            int count = 1;
            while (count <= before) {
                if (arr[i - count] == arr[i]) {
                    break;
                }
                count++;
            }
            dp[i] = count;
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
