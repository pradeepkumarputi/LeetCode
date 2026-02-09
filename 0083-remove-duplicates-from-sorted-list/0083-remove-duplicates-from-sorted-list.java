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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode fast=head;
        ListNode slow=head.next;
        while(slow!=null){
            if(fast.val==slow.val){
                slow=slow.next;
            }
            else{
                fast.next=slow;
                fast=fast.next;
                slow=slow.next;
            }
        }
        fast.next=null;
        return head;
    }
}