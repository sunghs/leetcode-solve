package sunghs.leetcode.solve.test;

public class Solution {

    public static void main(String[] args) {

    }

    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    result++;
                }
            }
        }
        return result;
    }
}
