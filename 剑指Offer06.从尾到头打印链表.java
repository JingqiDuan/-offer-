/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        int index = 0;
        while(head != null){
            stack.push(head);
            head = head.next;
            index++;
        }
        int[] result = new int[index];
        for(int i = 0; i < index; i ++){
            result[i] = stack.pop().val;
        }
        return result;
    }
}
