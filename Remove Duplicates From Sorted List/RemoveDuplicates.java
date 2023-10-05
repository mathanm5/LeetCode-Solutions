class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode curr = head;
        while(curr != null){
        if(curr.next != null && curr.val == curr.next.val){
            while(curr.next != null && curr.val == curr.next.val){
                curr = curr.next;
            }
            prev.next = curr;
            prev = curr;
        }
        else{
            prev = curr;
        }
        curr = curr.next;
        }
        return dummyHead.next;
    }
}
//TC:O(n), SC:O(1)