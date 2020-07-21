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

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(candies[i], max);
        }

        System.out.println(max);

        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int csr = candies[i] + extraCandies;
            result.add(csr >= max);
        }
        return result;
    }
}
