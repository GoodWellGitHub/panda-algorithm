package com.org.data.datastruandalgorith.recursion;

/**
 * 用分治法找出一个数组最小值和最大值
 */
public class SimPleMinMax {
    public static void main(String[] args) {
        int[] arr = {4, 12, 0, 89, 12, -4,-4, 32, 1, 890, 1320};
        SimPleMinMax simPleMinMax = new SimPleMinMax();
        IntPar intPar = simPleMinMax.solution(arr, 0, arr.length - 1);
        System.out.println("min=" + intPar.min + "  max=" + intPar.max);
    }

    public IntPar solution(int[] arr, int low, int high) {
        IntPar intPar = new IntPar();
        if (high - low < 2) {
            if (arr[low] < arr[high]) {
                intPar.min = arr[low];
                intPar.max = arr[high];
            } else {
                intPar.min = arr[high];
                intPar.max = arr[low];
            }
            return intPar;
        }
        int mid = (low + high) / 2;
        IntPar intPar1 = solution(arr, low, mid);
        IntPar intPar2 = solution(arr, mid + 1, high);
        intPar.min = intPar1.min < intPar2.min ? intPar1.min : intPar2.min;
        intPar.max = intPar1.max > intPar2.max ? intPar1.max : intPar2.max;
        return intPar;
    }

    private class IntPar {
        int min;
        int max;
    }
}
