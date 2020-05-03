package com.org.niuke;

/**
 * 给定两个字符串，给出两个字符串的最长公共子序列
 * 例如 Str1="1A2C3D4B56;Str2="B1D23CA45B6A;
 * 则最长公共子序列是123456或者12C4B6
 */
public class DyFindTowStrMaxSubStr {
    public static void main(String[] args) {
        String str1="1A2C3D4B56";
        String str2="B1D23CA45B6A";
        char[] str1Arr=str1.toCharArray();
        char[] str2Arr=str2.toCharArray();
        int result=find1(str1Arr,str2Arr);
        System.out.println(result);
    }

    public static int find1(char[] str1, char[] str2) {
        int m = str1.length;
        int n = str2.length;
        /**
         * dp[i][j]表示字符1 0-i和字符2 0-j之间公共子序列的最大长度
         */
        int dp[][] = new int[m][n];
        dp[0][0] = str1[0] == str2[0] ? 1 : 0;
        for (int i = 1; i < m; i++) {
            if (dp[i - 1][0] == 1 || str1[i] == str2[0]) {
                dp[i][0] = 1;
            } else {
                dp[i][0] = 0;
            }
        }
        for (int j = 1; j < n; j++) {
            if (dp[0][j - 1] == 1 || str2[j] == str1[0]) {
                dp[0][j] = 1;
            } else {
                dp[0][j] = 0;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (str1[i] != str2[j]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1] + 1, dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }
        return dp[m-1][n-1];
    }
}
