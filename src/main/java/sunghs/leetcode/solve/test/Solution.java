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

    public int balancedStringSplit(String s) {
        int result = 0;
        int lCnt = 0;
        int rCnt = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                rCnt++;
            } else {
                lCnt++;
            }

            if (lCnt != 0 && lCnt == rCnt) {
                result++;
                lCnt = rCnt = 0;
            }
        }
        return result;
    }

}
