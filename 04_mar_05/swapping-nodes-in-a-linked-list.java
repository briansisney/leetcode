# https://leetcode.com/problems/swapping-nodes-in-a-linked-list/


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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode front_k = head;
        ListNode back_k = head;
        ListNode curr = head;
        int curr_index = 1;
        int temp;
        while (curr.next != null) {
            curr = curr.next;
            curr_index++;

            if (curr_index == k) {
               front_k = curr;
            } else if(curr_index > k) {
                back_k = back_k.next;
            }
        }

        temp = front_k.val;
        front_k.val = back_k.val;
        back_k.val = temp;

        return head;
    }
}
