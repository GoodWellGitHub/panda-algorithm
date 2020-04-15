package com.org.niuke;

public class FindFirstLeftTarget {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 2, 3};
        System.out.println(left_bound(numbers, 13));
    }

    static int left_bound(int[] numbers, int target) {
        if (numbers.length == 0) {
            return -1;
        }
        int left = 0;
        int right = numbers.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (numbers[mid] == target) {
                right = mid;
            } else if (numbers[mid] < target) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        if (left == numbers.length) {
            return -1;
        }
        return numbers[left] == target ? left : -1;

    }
}
