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
class 2Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        int rem = 0;
        while(l1 != null && l2 != null){
            if(l1.val + l2.val + rem < 10){
                cur.next = new ListNode(l1.val + l2.val + rem);
                cur = cur.next;
                rem = 0;
            }else{
                cur.next = new ListNode(l1.val + l2.val + rem - 10);
                cur = cur.next;
                rem = 1;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            if(l1.val + rem < 10){
                cur.next = new ListNode(l1.val + rem);
                cur = cur.next;
                rem = 0;
            }else{
                cur.next = new ListNode(l1.val + rem - 10);
                cur = cur.next;
                rem = 1;
            }
            l1 = l1.next;
        }
        while(l2 != null){
            if(l2.val + rem < 10){
                cur.next = new ListNode(l2.val + rem);
                cur = cur.next;
                rem = 0;
            }else{
                cur.next = new ListNode(l2.val + rem - 10);
                cur = cur.next;
                rem = 1;
            }
            l2 = l2.next;
        }
        if(rem == 1){
            cur.next = new ListNode(1);
        }
        return head.next;
    }
}
