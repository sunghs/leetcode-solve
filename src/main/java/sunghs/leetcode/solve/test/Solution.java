package sunghs.leetcode.solve.test;

public class Solution {

    public static void main(String[] args) {

    }

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int csr = 0;
        for (int i = 0; i < n; i++) {
            result[csr++] = nums[i];
            result[csr++] = nums[i + n];
        }
        return result;
    }
}
