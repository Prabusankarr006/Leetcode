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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(size(head)<k){
            return head;
        }
        ListNode current=head;
        ListNode prev=null;
        ListNode next=null;
        int count=0;
        while(count!=k && current!=null){
            count++;
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head.next=reverseKGroup(current,k);
        return prev;
    }
    
    public int size(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}