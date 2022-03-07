/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode answer = dummy;
        while(head != null){
            if(head.val != val){
                dummy.next = head;
                head = head.next;
                dummy = dummy.next;
            }else{
                head = head.next;
            }
        }
        dummy.next = null;//don't forget
        return answer.next;
    }
}
