# https://leetcode.com/problems/odd-even-linked-list

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
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode curr = head;
        ListNode even = head;
        ListNode even_last = head;
        ListNode odd = head;
        ListNode odd_last = head;
        int curr_index = 0;
        int temp;
        while (curr.next != null) {
            curr = curr.next;
            curr_index++;

            if (curr_index == 1) {
                odd = curr;
                odd_last = curr;
            } else if (curr_index % 2 == 0) {
                even_last.next = curr;
                even_last = curr;
            } else {
                odd_last.next = curr;
                odd_last = curr;
            }
        }
        even_last.next = odd;
        odd_last.next = null;

        return even;
    }
}