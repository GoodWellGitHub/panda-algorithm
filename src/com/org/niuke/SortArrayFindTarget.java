package com.org.niuke;

public class SortArrayFindTarget {
    public static void main(String[] args) {
        int target=16;
        int[][] array={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean result=Find(target,array);
        System.out.println(result);
    }
    public static boolean Find(int target, int [][] array) {
        int rows=array.length;
        int cols=array[0].length;
        int rowTemp=rows-1;
        int colTemp=0;
        while(rowTemp>=0&&colTemp<cols){
            if(target==array[rowTemp][colTemp]){
                return true;
            }else if(target>array[rowTemp][colTemp]){
                colTemp++;
            }else{
                rowTemp--;
            }
        }
        return false;
    }
}
