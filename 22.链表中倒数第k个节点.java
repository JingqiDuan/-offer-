/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int size = 0;
        while(head != null){
            head = head.next;
            size++;
        }
        for(int i = 0; i < size - k; i++){
            dummy = dummy.next;
        }
    return dummy.next;
    }
}
