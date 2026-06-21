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
    public ListNode deleteMiddle(ListNode head) {
        // Edge case: If only one node, return null
        if (head == null || head.next == null) {
            return null;
        }
        
        // Use slow and fast pointers to find middle
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        // Fast moves 2 steps, slow moves 1 step
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Delete middle node (slow)
        prev.next = slow.next;
        
        return head;
    }
}
