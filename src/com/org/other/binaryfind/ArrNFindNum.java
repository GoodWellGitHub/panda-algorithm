package com.org.other.binaryfind;

/**
 * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
 * 输入: [1,3,4,2,2]
 * 输出: 2
 * 输入: [3,1,3,4,2]
 * 输出: 3
 * <p>
 * 说明：
 * <p>
 * 不能更改原数组（假设数组是只读的）。
 * <p>
 * 只能使用额外的 O(1) 的空间。
 * <p>
 * 时间复杂度小于 O(n^2) 。
 * <p>
 * 数组中只有一个重复的数字，但它可能不止重复出现一次。
 */
public class ArrNFindNum {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 2, 2};
        int[] arr2 = {3, 1, 2, 4, 2};
/*        int result1 = find1(arr1);
        System.out.println(result1);
        int result2 = find1(arr2);
        System.out.println(result2);*/
        int result=findDuplicate(arr1);
        System.out.println(result);

    }

    /**
     * 利用二分查找
     * 如果小于等于n的数大于n个，则重复数字比n小，否则，重复数字比n大
     *
     * @param
     * @return
     */
    public static int find1(int[] arr) {
        int n = arr.length - 1;
        int start = 1;
        int end = n;
        int tempn = 0;
        while (start < end) {
            tempn = start + (end - start) / 2;
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= tempn) {
                    count++;
                }
            }
            if (count <= tempn) {
                start = tempn+1;
            } else {
                end = tempn;
            }
        }
        return start;
    }
    //快慢指针
    public static int findDuplicate(int[] nums) {
        int fast = nums[nums[0]];
        int slow = nums[0];

        while (fast != slow) {
            fast = nums[nums[fast]];
            slow = nums[slow];
        }

        slow = 0;
        while (fast != slow) {
            fast = nums[fast];
            slow = nums[slow];
        }

        return slow;
    }

}
