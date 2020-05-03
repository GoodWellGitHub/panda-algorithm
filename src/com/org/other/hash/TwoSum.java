package com.org.other.hash;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 *
 * 所以返回 [0, 1]
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2, 7, 11, 15};
        int target=17;
        int[] index=findSum(arr,target);
        if (index==null){
            System.out.println("不能找到和为 "+target+" 的两个数");
        }else {
            System.out.println("和为 "+target+" 的两个下标为 "+index[0]+"  "+index[1]);
        }
    }
    public static int[] findSum(int[] arr,int target){
        int[] index=null;
        if (arr.length<2){
            return index;
        }
        HashMap<Integer,Integer> storeIndex=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int num=arr[i];
            int temp=target-num;
            Integer indexTemp=storeIndex.get(temp);
            if (indexTemp!=null){
                index=new int[2];
                index[0]=indexTemp;
                index[1]=i;
                return index;
            }else {
                storeIndex.put(num,i);
            }
        }
        return index;
    }
}
