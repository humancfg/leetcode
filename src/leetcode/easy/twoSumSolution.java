package leetcode.easy;

import java.util.Arrays;

public class twoSumSolution {
    public static void main(String[] args) {
        int[] test = {2, 13, 7, 1};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(test, target)));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        int temp;
        int firstValue;
        int secondValue;

        for (int i = 0; i < nums.length - 1; i++) {
            firstValue = nums[i];
            secondValue = nums[i + 1];
            temp = firstValue + secondValue;

            if (temp == target) {
                answer = fillAnswerArray(firstValue, secondValue);
            }
        }

        return answer;
    }

    static int[] fillAnswerArray(int... ints) {
        int[] filledArray = new int[ints.length];

        for (int j = 0; j < filledArray.length - 1; j++) {
            filledArray[j] = j;
            filledArray[j + 1] = j + 1;
        }

        return filledArray;
    }
}
