/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            if(slow==null || fast.next==null) return null;
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        ListNode temp=head;
        while(slow!=temp){
            if(slow==null) return null;
            temp=temp.next;
            slow=slow.next;
        }
        return temp;
    }
}