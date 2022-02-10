package com.yy.algorithm.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yu
 * @create 2022-02-09 16:12
 * @Description
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            //1.如果起始元素大于0直接退出
            if (nums[i] > 0) break;
            //2.如果当前元素等于上一个元素,无需重复判断
            if (i > 0 && nums[i] == nums[i-1]) continue;
            //3.定义左右指针(索引位置)
            int L,R;
            L = i + 1;
            R = nums.length - 1;
            //4.移动左右指针
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    //4.1如果三数和为0
                    //将结果添加到集合
                    lists.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    //将左右指针向中间缩进
                    L ++;
                    R --;
                    //如果当前元素等于上一个元素直接跳过,可能有连续多个相等
                    while (L < R && nums[L] == nums[L-1]) L++;
                    while (L < R && nums[R] == nums[R+1]) R--;
                }else if (sum < 0) {
                    //4.2如果三数和小于0,增大左指针
                    L ++;
                }else {
                    //4.3如果三数和大于0,减小右指针
                    R --;
                }
            }
        }
        return lists;
    }

}
