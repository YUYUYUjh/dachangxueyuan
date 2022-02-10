package com.yy.algorithm.binary_search;

/**
 * @author Yu
 * @create 2022-02-10 17:07
 * @Description
 */
public class BinarySearch {
    public static int binarySearch(int[] nums,int key){
        //定义左右指针
        int low = 0;
        int high = nums.length - 1;

        //目标key不在数组范围
        if (key < nums[low] || key > nums[high])
            return -1;

        while (low <= high){
            //定义中间
            int mid = (low + high) / 2;
            if (key > nums[mid])
                low = mid + 1;
            else if (key < nums[mid])
                high = mid - 1;
            else
                return mid;
        }
        return  -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int i = binarySearch(nums, 3);
        System.out.println(i);
    }
}
