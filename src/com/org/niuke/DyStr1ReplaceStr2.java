package com.org.niuke;

/**
 * 将字符串str1变换成str2，给出三个整数，ic,dc,rc分别代表增加，删除，替换一个字符的代价
 * str1=abc str2=adc ic=1,dc=5,rc=3，此时最小代价为替换 为3
 * 如果ic=1,dc=5,rc=100,此时最小代价为删除再插入 为6
 *
 */
public class DyStr1ReplaceStr2 {
    public static void main(String[] args) {
        char[] arr1="abc".toCharArray();
        char[] arr2="adc".toCharArray();
        int ic=1,dc=5,rc=3;
        int result=find1(arr1,arr2,ic,dc,rc);
        System.out.println(result);
    }

    public static int find1(char[] charArr1,char[] charArr2,int ic,int dc,int rc){
        int rowN=charArr1.length;
        int colN=charArr2.length;
        int[][] dp=new int[rowN+1][colN+1];
        for (int i=0;i<=rowN;i++){
            dp[i][0]=dc*i;
        }
        for (int i=1;i<=colN;i++){
            dp[0][i]=ic*i;
        }
        for (int i=1;i<=rowN;i++){
            for (int j=1;j<=colN;j++){
                int min=Math.min((dp[i-1][j]+dc),(dp[i][j-1]+ic));
                if (charArr1[i-1]==charArr2[j-1]){
                    dp[i][j]=Math.min(min,dp[i-1][j-1]);
                }else {
                    dp[i][j]=Math.min(min,(dp[i-1][j-1]+rc));
                }
            }
        }
        return dp[rowN][colN];
    }
}
