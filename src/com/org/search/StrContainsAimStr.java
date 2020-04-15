package com.org.search;

/**
 * 有一个字符串Str，判断其中是否有包含字符串aim的连续子串，顺序不作要求
 */
public class StrContainsAimStr {
    public static void main(String[] args) {
        String str="asdxdwcx";
        String aim="wddx";
        int result=containStr1(str,aim);
        System.out.println(result);
    }


    public static int containStr1(String str,String aim){
        char[] strChar=str.toCharArray();
        char[] aimChar=aim.toCharArray();

        return match(strChar,aimChar);

    }
    public static int match(char[] strChar,char[] aim){
        int[] count=new int[256];
        int re=0;
        for (int i=0;i<aim.length;i++){
            count[aim[i]]=count[aim[i]]+1;
        }
        for (int i=0;i<aim.length;i++){
            count[strChar[i]]=count[strChar[i]]-1;
            if (count[strChar[i]]<0){
                re++;
            }
        }
        if (re==0){
            return 0;
        }
        int len=aim.length;
        for (;len<strChar.length;len++){
            if (count[strChar[len-aim.length]]<0){
                re--;
            }
            count[strChar[len-aim.length]]++;
            count[strChar[len]]--;
            if (count[strChar[len]]<0){
                re++;
            }
            if (re==0){
                return len-aim.length+1;
            }
        }

        return -1;

    }

}
