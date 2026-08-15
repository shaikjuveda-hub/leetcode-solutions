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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode ptr = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                ptr.next = list1;
                list1 = list1.next;
            } else {
                ptr.next = list2;
                list2 = list2.next;
            }
            ptr = ptr.next;
        }
        if (list1 != null) {
            ptr.next = list1;
        }else {
            ptr.next = list2;
        }
        return dummy.next;
    }
}


/*


class Solution{
    public ListNode rec(ListNode curr1,ListNode curr2){
        if(curr1==null){
            return curr2;
        }
        if(curr2==null){
            return curr1;
        }
        if(curr1.val<curr2.val){
            curr1.next=rec(curr1.next,curr2);
            return curr1;
        }
        else{
            curr2.next=rec(curr1,curr2.next);
            return curr2;
        }
    }
}           */