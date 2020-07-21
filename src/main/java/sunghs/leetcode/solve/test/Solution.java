package sunghs.leetcode.solve.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
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

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int idx = index[i];
            int val = nums[i];
            result.add(idx, val);
        }

        int[] r = new int[result.size()];

        for (int i = 0; i < r.length; i++) {
            r[i] = result.get(i).intValue();
        }
        return r;
    }
}
