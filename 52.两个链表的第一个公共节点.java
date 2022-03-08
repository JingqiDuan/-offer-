/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dummyA = headA;
        ListNode dummyB = headB;
        int sizeA = 0, sizeB = 0;
        while(dummyA != null){
            dummyA = dummyA.next;
            sizeA++;
        }
        while(dummyB != null){
            dummyB = dummyB.next;
            sizeB++;
        }
        if(sizeA > sizeB){
            for(int i = 0; i < sizeA - sizeB; i++){
                headA =  headA.next;
            }
        }
        if(sizeA < sizeB){
            for(int i = 0; i < sizeB - sizeA; i++){
                headB =  headB.next;
            }
        }
        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            }else{
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
}
