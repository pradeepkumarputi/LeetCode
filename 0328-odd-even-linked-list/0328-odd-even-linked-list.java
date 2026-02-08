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
        ListNode temp=head;
        ListNode temp1=new ListNode(100);
        ListNode temp2=new ListNode(50);
        ListNode h1=temp1;
        ListNode h2=temp2;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        for(int i=1;i<=size;i++){
            if(i%2!=0){
                ListNode a=new ListNode(temp.val);
                h1.next=a;
                h1=h1.next;
                temp=temp.next;
            }
            else{
                ListNode b=new ListNode(temp.val);
                h2.next=b;
                h2=h2.next;
                temp=temp.next;
            }
        }
        h1.next=temp2.next;
        return temp1.next;
    }
}