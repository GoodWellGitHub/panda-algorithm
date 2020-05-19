package com.org.niuke;

import java.util.HashMap;
import static java.lang.Math.*;

/**
 * 众所周知，牛妹有很多很多粉丝，粉丝送了很多很多礼物给牛妹，牛妹的礼物摆满了地板。
 * 地板是N\times MN×M的格子，每个格子有且只有一个礼物，牛妹已知每个礼物的体积。
 * 地板的坐标是左上角(1,1)  右下角（N, M）。
 * 牛妹只想要从屋子左上角走到右下角，每次走一步，每步只能向下走一步或者向右走一步或者向右下走一步
 * 每次走过一个格子，拿起（并且必须拿上）这个格子上的礼物。
 * 牛妹想知道，她能走到最后拿起的所有礼物体积最小和是多少？
 *
 * [[1,2,3],[2,3,4]]
 * 输出
 *
 * 7
 * 说明
 * (1,1)->(1,2)->(2,3)
 */
public class FindMinAreaGift {

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{2,3,4}};
        int result=find(0,0,arr);
        System.out.println(result);
        int resullt1=find1(arr);
        System.out.println(resullt1);
    }

    public static int find(int x,int y,int[][] arr){
        if (x==arr.length-1&&y==arr[0].length-1){
            return arr[x][y];
        }else if (x<arr.length-1&&y<arr[0].length-1){
           return arr[x][y]+Math.min(find(x+1,y,arr),Math.min(find(x,y+1,arr),find(x+1,y+1,arr)));
        }else if (x==arr.length-1){
            return arr[x][y]+find(x,y+1,arr);
        }else if (y==arr[0].length-1)
            return arr[x][y]+find(x+1,y,arr);

        return 0;
    }

    public static int find1(int[][] arr){
        if (arr==null||arr.length==0||arr[0].length==0){
            return 0;
        }
        int x=arr.length;int y=arr[0].length;
        int[][] temp=new int[x+1][y+1];
        for (int i=1;i<temp[0].length;i++){
            temp[0][i]=temp[0][i-1]+arr[0][i-1];
        }
        for (int j=1;j<temp.length;j++){
            temp[j][0]=temp[j-1][0]+arr[j-1][0];
        }
        for (int i=1;i<temp.length;i++){
            for (int j=1;j<temp[0].length;j++){
                temp[i][j]=min(temp[i-1][j-1],min(temp[i-1][j],temp[i][j-1]))+arr[i-1][j-1];
            }
        }
        return temp[x][y];
    }




}
