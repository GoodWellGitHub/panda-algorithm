package com.org.other.math;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *用回朔法和递归实现
 */
public class QuanPaiLie {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3};
        digui(array,0);
    }

    public static void digui(int[] arr,int start){
        if (start==arr.length){
            System.out.println(Arrays.toString(arr));
        }
        for (int i=start;i<arr.length;i++){
            swap(start,i,arr);
            digui(arr,start+1);
            swap(start,i,arr);
        }
    }

    private static void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
