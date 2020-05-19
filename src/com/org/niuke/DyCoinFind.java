package com.org.niuke;

/**
 * 给定数组arr,arr中所有的值都为正数且不重复，每个值代表一种面值的货币，
 * 每种面值的货币可以使用任意张，再给定一个整数aim代表要找的钱数，求换钱有多少种方法。
 */
public class DyCoinFind {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4};
        int aim = 3;
        if (arr1 == null || arr1.length == 0 || aim < 0) {
        }
        int result1 = find1(arr1, 0, aim);

        System.out.println(result1);

        int[][] map = new int[arr1.length][aim + 1];
        int result2 = find2(arr1, 0, aim, map);
        System.out.println(result2);

        int[][] map22 = new int[arr1.length + 1][aim + 1];
        int result22 = find22(arr1, 0, aim, map22);
        System.out.println(result22);

        int result3 = find3(arr1, aim);
        System.out.println(result3);


        int result4 = find3(arr1, aim);
        System.out.println(result4);
    }

    /**
     * 暴力搜索
     * 1 0*arr[0],剩下的res1
     * 2 1*arr[0] ，剩下的res2
     * <p>
     * .
     * n  x*arr[0] 剩下的resn
     *
     * @param arr   面值数组
     * @param index 面值数组下标
     * @param aim   组成的金额
     * @return
     */
    public static int find1(int[] arr, int index, int aim) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        if (index == arr.length || aim <= 0) {
            return aim == 0 ? 1 : 0;
        }
        int result = 0;
        for (int i = 0; i <= aim / arr[index]; i++) {
            result = result + find1(arr, index + 1, aim - arr[index] * i);
        }
        return result;
    }

    /**
     * 用map数组记录下来已经计算过的过程
     *
     * @param arr
     * @param index
     * @param aim
     * @param map
     * @return
     */
    public static int find2(int[] arr, int index, int aim, int[][] map) {
        if (index == arr.length || aim <= 0) {
            return aim == 0 ? 1 : 0;
        }
        if (map[index][aim] != 0) {
            return map[index][aim];
        }
        int result = 0;
        for (int i = 0; i <= aim / arr[index]; i++) {
            result = result + find2(arr, index + 1, aim - arr[index] * i, map);
            map[index][aim] = result;
        }
        return result;
    }

    public static int find22(int[] arr, int index, int aim, int[][] map) {
        if (index == arr.length || aim <= 0) {
            return aim == 0 ? 1 : 0;
        }
        int result = 0;
        int mapValue = 0;
        for (int i = 0; i <= aim / arr[index]; i++) {
            mapValue = map[index + 1][aim - arr[index] * i];
            if (mapValue != 0) {
                result += mapValue == -1 ? 0 : mapValue;
            } else {
                result = result + find22(arr, index + 1, aim - arr[index] * i, map);
            }
        }
        map[index][aim] = result == 0 ? -1 : result;
        return result;
    }

    public static int find3(int[] arr, int aim) {
        int[][] dp = new int[arr.length][aim + 1];
        for (int i = 0; i < arr.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i <= aim; i++) {
            if (i % arr[0] == 0) {
                dp[0][i] = 1;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= aim; j++) {
                int res = 0;
                for (int k = 0; k * arr[i] <= j; k++) {
                    res += dp[i - 1][j - k * arr[i]];
                }
                dp[i][j] = res;
            }
        }
        return dp[arr.length - 1][aim];
    }

    public static int find4(int[] arr, int aim) {
        int[][] dp = new int[arr.length][aim + 1];
        for (int i = 0; i < arr.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i <= aim; i++) {
            if (i % arr[0] == 0) {
                dp[0][i] = 1;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= aim; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i]];
            }
        }
        return dp[arr.length - 1][aim];
    }


}
