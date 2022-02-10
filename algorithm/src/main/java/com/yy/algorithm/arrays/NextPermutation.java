package com.yy.algorithm.arrays;

import sun.security.util.Length;

import java.util.Arrays;

/**
 * @author Yu
 * @create 2022-02-10 9:25
 * @Description
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int k = nums.length - 2;
        //从右开始找到升序的两个相邻元素
        while (k > 0 && nums[k] >= nums[k+1]) k--;
        // k<0 说明nums是降序数组,直接返回升序数组
        if (k < 0) {
            Arrays.sort(nums);
            return;
        }

        int i = k + 2;
        //从第k+2个元素往右开始找大于nums[k]的元素
        while (i < nums.length && nums[k] < nums[i]) i++;
        //交换nums[k]和找到的nums[i-1]
        int temp = nums[k];
        nums[k] = nums[i-1];
        nums[i-1] = temp;

        //k以后剩余的部分反转为升序
        int start = k + 1,end = nums.length - 1;
        while (start < end) {
            int reTemp = nums[start];
            nums[start] = nums[end];
            nums[end] = reTemp;
            start++;
            end--;
        }

    }
}
