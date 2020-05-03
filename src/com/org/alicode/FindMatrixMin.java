package com.org.alicode;

/**
 * 概述：
 * 给定一个矩阵，大小为m，从左上角开始每次只能向右走或者向下走，最后达到右下角的位置。
 * 路径中所有数字累加起来就是路径和，返回所有路径的最小路径和。

 * 示例1
 * 比如输入矩阵为
 * 4 1 5 3
 * 3 2 7 7
 * 6 5 2 8
 * 8 9 4 5
 * <p>
 * <p>
 * 最小路径为
 * 23
 */
public class FindMatrixMin {
    public static void main(String[] args) {

    }

    public static int solution1(int[][] trix){
        int rowCount=trix.length;
        int colCount=trix[0].length;
        int count=rowCount+colCount;
        int dp[]=new int[count];
        dp[1]=4;
        int j=0;
        int result=4;
        for (int i=2;i<count;i++){
            if (i<rowCount-1&&j<colCount-1){
               // dp[i]=Math.min(dp[i-1]+trix[i])
            }
        }
        return 1;
    }
}
