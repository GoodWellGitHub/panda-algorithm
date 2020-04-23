<<<<<<< HEAD
package com.org.other.stringmatch;

/**
 * 朴素字符串匹配算法
 */
public class SimpleMatch {
    public static void main(String[] args) {
        String source="helloiamcoming";
        String target="h";
        int start=matchIndex(source.toCharArray(),target.toCharArray());
        System.out.println(start);
    }


    public static int matchIndex(char[] source,char[] target){
        int sourceLength=source.length;
        int targetLength=target.length;
        for (int i=0;i<=sourceLength-targetLength;i++){
            int j=i;
            while (j<i+targetLength){
                if (source[j]==target[j-i]){
                    j++;
                }else {
                    break;
                }
            }
            if (j==i+targetLength){
                return i;
            }
        }
        return -1;
    }
}
=======
package com.org.other.stringmatch;

/**
 * 朴素字符串匹配算法
 */
public class SimpleMatch {
    public static void main(String[] args) {
        String source="helloiamcoming";
        String target="h";
        int start=matchIndex(source.toCharArray(),target.toCharArray());
        System.out.println(start);
    }


    public static int matchIndex(char[] source,char[] target){
        int sourceLength=source.length;
        int targetLength=target.length;
        for (int i=0;i<=sourceLength-targetLength;i++){
            int j=i;
            while (j<i+targetLength){
                if (source[j]==target[j-i]){
                    j++;
                }else {
                    break;
                }
            }
            if (j==i+targetLength){
                return i;
            }
        }
        return -1;
    }
}
>>>>>>> 70a0aec4f2394519fba93383ef82731f766dbf1d
