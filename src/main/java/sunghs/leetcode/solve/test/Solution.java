package sunghs.leetcode.solve.test;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode head = result;
        boolean upper = false;
        while (l1 != null || l2 != null) {
            int d = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val);
            if (upper) {
                d++;
                upper = false;
            }

            ListNode tmp = new ListNode();
            if (d >= 10) {
                upper = true;
                d = d % 10;
            }
            tmp.val = d;

            if (result == null) {
                result = tmp;
                head = result;
            } else {
                result.next = tmp;
                result = result.next;
            }

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (upper) {
            result.next = new ListNode(1);
        }
        return head;
    }
}
