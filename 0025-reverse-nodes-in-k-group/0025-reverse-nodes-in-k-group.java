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
        ListNode curr=head;
        for(int i=0;i<k;i++){
            if(curr==null){
                return head;
            }
            curr=curr.next;
        }
        int count=0;
        ListNode prev=null;
        curr=head;
        while(curr!=null && count<k){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count+=1;
        }
        head.next=reverseKGroup(curr,k);
        return prev;
    }
}