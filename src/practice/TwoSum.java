package practice;

import java.util.HashMap;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int [] res = new int [2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(map.containsKey(difference)) {
                res[0] = i;
                res[1] = map.get(difference);
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
