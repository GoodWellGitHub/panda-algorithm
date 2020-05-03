package com.org.niuke;

/**
 * 寻找最大子序列长度
 */
public class DyFindLastSubList {
    public static void main(String[] args) {
        int[] arr={2,1,5,3,6,4,8,9,7};
        int result=find2(arr);
        System.out.println(result);
    }
    public static int find1(int[] arr,int index,int find){
        if (index==0){
           return arr[find]>arr[0]?1:0;
        }
        for (int i =index;i>=0;i--){

        }
        return 0;
    }

    /**
     * dp[i]=max{dp[j]+1,0<=j<i,arr[j]<arr[i]}
     * @param arr
     * @return
     */
    public static int find2(int[] arr){
        int[] dp=new int[arr.length];
        dp[0]=1;
        for (int i=1;i<arr.length;i++){
            int k=i-1;
            while (k>=0){
                if (arr[k]<arr[i]){
                    dp[i]=dp[k]+1;
                    break;
                }
                k--;
            }
            if (k==-1){
                dp[i]=1;
            }
        }
        int max=0;
        for (int i=0;i<arr.length;i++){
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
