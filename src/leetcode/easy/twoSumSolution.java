package leetcode.easy;

import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSumSolution {

    public static void main(String[] args) {
        int[] test = {-1, -2, -3, -4, -5};
        int target = -8;

        System.out.println(Arrays.toString(twoSum(test, target)));


    }

    static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> tempMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int requiredNumber = target - nums[i];

            if (tempMap.containsKey(requiredNumber)) {
                return new int[]{tempMap.get(requiredNumber), i};
            }

            tempMap.put(nums[i], i);
        }

        return null;
    }
}


