package com.org.leetcode;

/**
 * 4. 寻找两个有序数组的中位数
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * <p>
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * <p>
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * <p>
 * 示例 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * 则中位数是 2.0
 * 示例 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * 则中位数是 (2 + 3)/2 = 2.5
 */
public class FindTowArrMid {
    public static void main(String[] args) {

    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1=nums1.length;
        int length2=nums2.length;
        if(nums1[length1-1]<nums2[0]){
            if(length1==length2){
                return (nums2[0]+nums1[length1-1])/2;
            }else if(length1<length2){
                int ch=length2-length1;
                if(ch%2==0){
                    return (nums2[ch/2-1]+nums2[ch/2])/2;
                }else{
                    return nums2[ch/2];
                }
            }else if(length1>length2){
                int ch=length1-length2;
                if(ch%2==0){
                    return (nums1[length1-ch/2]+nums1[length1-ch/2-1])/2;
                }else{
                    return (nums1[length1-ch/2]);
                }
            }
        }else if(nums2[length2-1]<nums1[0]){
            if(length1==length2){
                return (nums1[0]+nums2[length2-1])/2;
            }else if(length1<length2){
                int ch=length2-length1;
                if(ch%2==0){
                    return (nums2[length2-ch/2-1]+nums2[length2-ch/2])/2;
                }else{
                    return nums2[length2-ch/2];
                }
            }else if(length1>length2){
                int ch=length1-length2;
                if(ch%2==0){
                    return (nums1[ch/2-1]+nums2[ch/2])/2;
                }else{
                    return nums1[ch/2];
                }
            }
        }else{

        }

        return 0d;
    }
}
