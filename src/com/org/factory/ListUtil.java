package com.org.factory;

/**
 * Created by huajun.wang01 on 2018/12/15.
 */
public class ListUtil {
    public static Integer[] createIntegerSortArray() {
        Integer[] integers = new Integer[9];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = i;
        }
        return integers;
    }

    public static Integer[] createUnorderedArray() {
        Integer[] integers = new Integer[10];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = (int) (1 + Math.random() * (10));
        }
        return integers;
    }
}
