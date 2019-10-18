package com.org.niuke.swordtooffer;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceCharWithString {
    public static String solution(StringBuffer str) {
        char[] charArr = str.toString().toCharArray();
        int length = str.length();
        int i = 0;
        StringBuilder strResult = new StringBuilder("");
        while (i < length) {
            if (96 < str.charAt(i) && str.charAt(i) < 123 || 64 < str.charAt(i) && str.charAt(i) < 91) {
                strResult.append(str.charAt(i));
            } else {
                strResult.append("%20");
            }
            i++;
        }
        return strResult.toString();

    }

    public static void main(String[] args) {

    }
}
