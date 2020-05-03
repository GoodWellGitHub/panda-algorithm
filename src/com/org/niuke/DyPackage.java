package com.org.niuke;

/**
 * 背包问题
 * 一个背包有一定的承重w，有n件物品，每件都有自己的价值，记录在数组V中，也都有自己的重量，记录在数组w中，
 * 每件物品只能选择要装入背包还是不装背包，要求不超过背包承重的前提下，选出物品总价值最大
 */
public class DyPackage {
    public static void main(String[] args) {
        int[] w={3,2,6,1,7};
        int[] v={1,5,12,13,19};
        int wt=7;
        int result=find1(w,v,wt,0);
        System.out.println(result);

        int result2=find2(w,v,wt);
        System.out.println(result2);
    }
    public static int find1(int[] w,int [] v,int lw,int index){
        if (index==v.length||lw<=0){
            return 0;
        }
        if (lw<w[index]){
            return find1(w,v,lw,index+1);
        }
        return Math.max(find1(w,v,lw-w[index],index+1)+v[index],find1(w,v,lw,index+1));
    }

    public static int find2(int[] w,int[] v,int wt){
        int n=w.length;
        int[][] dp=new int[n+1][wt+1];
        for (int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for (int i=0;i<=wt;i++){
            dp[0][i]=0;
        }
        for (int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                if (w[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-w[i-1]]+v[i-1]);
                }
            }
        }
        return dp[n][wt];
    }
}
