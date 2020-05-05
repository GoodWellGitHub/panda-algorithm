package com.org.niuke;

/**
 * 寻找矩阵最小路径
 */
public class DyFindMinMaxtrim {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 9}, {8, 1, 3, 4}, {5, 0, 6, 1}, {8, 8, 4, 0}};
        int result1 = find1(arr, 3, 3);
        System.out.println(result1);

        int result2 = find2(arr);
        System.out.println(result2);
    }

    public static int find1(int arr[][], int i, int j) {
        if (i == 0 && j == 0) {
            return arr[0][0];
        }

        if (i > 0 && j > 0) {
            return Math.min(find1(arr, i - 1, j), find1(arr, i, j - 1)) + arr[i][j];
        } else if (i > 0 && j == 0) {
            return find1(arr, i - 1, j) + arr[i][j];
        } else if (i == 0 && j > 0) {
            return find1(arr, i, j - 1) + arr[i][j];
        }
        return 0;
    }

    public static int find2(int[][] arr) {
        int rowCount = arr.length;
        int colCount = arr[0].length;
        int[][] dp = new int[rowCount][colCount];
        dp[0][0] = arr[0][0];
        for (int i = 1; i < colCount; i++) {
            dp[0][i] = dp[0][i - 1] + arr[0][i];
        }
        for (int i = 1; i < rowCount; i++) {
            dp[i][0] = dp[i - 1][0] + arr[i][0];
        }

        for (int i = 1; i < rowCount; i++) {
            for (int j = 1; j < colCount; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + arr[i][j];
            }
        }
        return dp[rowCount - 1][colCount - 1];
    }
}
