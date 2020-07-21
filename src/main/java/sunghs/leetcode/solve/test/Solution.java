package sunghs.leetcode.solve.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int freq = 2 * i;
            int val = freq + 1;

            if (val > nums.length) {
                continue;
            }

            for (int j = 0; j < nums[freq]; j++) {
                list.add(nums[val]);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = (int) list.get(i);
        }
        return result;
    }
}
