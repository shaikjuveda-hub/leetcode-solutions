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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)
        {
            return head;
        }
        ListNode curr=head;
        int count=1;
        while(curr.next!=null)
        {
            curr=curr.next;
            count++;
        }
        System.out.println(curr.val);
        System.out.println(count);
        ListNode curr1 = head;
        k = k%count;
        if(k==0)
        {
            return head;
        }
        for(int i=1;i<count-k;i++)
        {
            curr1 = curr1.next;
        }
        System.out.println("curr v"+curr1.val);
        ListNode new_head = curr1.next;
        curr1.next=null;
        curr.next = head;
        return new_head;
    }
}