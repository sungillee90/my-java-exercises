package practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    // find all the set that sum of zero, UNIQ also
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output_arr = new LinkedList<>();

        for(int i = 0; i < nums.length-2; i++) {
            if (i == 0 || (i > 0 && nums[i] == nums[i - 1])) {
                int lower_Boud = (i + 1);
                int higher_Boud = (nums.length - 1);
                int sum = (0 - nums[i]);

                while (lower_Boud < higher_Boud) {
                    if (nums[lower_Boud] + nums[higher_Boud] == sum) {
                        output_arr.add(Arrays.asList(nums[i], nums[lower_Boud], nums[higher_Boud]));
                        while (lower_Boud < higher_Boud && nums[lower_Boud] == nums[lower_Boud + 1]) lower_Boud++;
                        while (lower_Boud < higher_Boud && nums[higher_Boud] ==  nums[higher_Boud - 1]) lower_Boud++;
                        lower_Boud++;
                        higher_Boud--;
                    } else if (nums[lower_Boud] + nums[higher_Boud] > sum) {
                        higher_Boud--;
                    } else {
                        lower_Boud++;
                    }
                }

            }
        }
        return output_arr;
    }
}
