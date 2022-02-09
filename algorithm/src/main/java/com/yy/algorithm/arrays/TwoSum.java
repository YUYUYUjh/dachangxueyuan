package com.yy.algorithm.arrays;

import java.util.HashMap;

public class TwoSum {
    //#1.两数之和
    public int[] twoSum(int[] nums, int target) {
        //1.key存target-i , value存当前i的下标
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            //2.判断map中是否包含当前元素i
            if (hashMap.containsKey(nums[i])){
                //3.包含说明当前元素i是之前元素被target相减的结果,根据key获取value即之前元素的下标
                return new int[]{hashMap.get(nums[i]),i};
            }
            //每次遍历将当前元素被target相减的结果放入key,当前元素的下标放入value
            hashMap.put(target - nums[i],i);
        }
        return null;
    }
}