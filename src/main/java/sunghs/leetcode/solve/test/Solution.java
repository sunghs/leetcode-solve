package sunghs.leetcode.solve.test;

import java.util.ArrayList;
import java.util.Arrays;

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

    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder(S);
        int start = 0;
        int end = 0;
        ArrayList<Integer> remove = new ArrayList<>();
        char[] parr = S.toCharArray();

        for (int i = 0; i < parr.length; i++) {
            if (parr[i] == '(') {
                start++;
            } else if (parr[i] == ')') {
                end++;
            }

            if (start == 1 && end == 0) {
                remove.add(i);
            }
            if (start == end && start > 0 && end > 0) {
                remove.add(i);
                start = 0;
                end = 0;
            }
        }

        Integer[] removeIndex = new Integer[remove.size()];
        removeIndex = remove.toArray(removeIndex);
        Arrays.sort(removeIndex);

        for (int i = removeIndex.length - 1; i >= 0; i--) {
            sb.deleteCharAt(removeIndex[i]);
        }
        return sb.toString();
    }
}
