class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode NewHead = null;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            ListNode temp = slow.next;
            fast = fast.next.next;
            slow.next = fast;
            temp.next = slow;
            if(prev != null){prev.next = temp;}
            prev = slow;
            slow = fast;
            if(NewHead == null){NewHead = temp;}
        }
        return NewHead;
    }
}