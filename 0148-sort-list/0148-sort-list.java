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
    public ListNode sortList(ListNode head) {
    

    //brute force approach

    /*    ArrayList<Integer> arr=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(arr);
        curr=head;
        int i=0;
        while(curr!=null){
            curr.val=arr.get(i);
            curr=curr.next;
            i+=1;
        }
        return head;    */

        

    //Bubble sort

    /*    ListNode i=head;
        while(i!=null){
            ListNode curr=head;
            while(curr!=null && curr.next!=null){
                if(curr.val>curr.next.val){
                    int temp=curr.val;
                    curr.val=curr.next.val;
                    curr.next.val=temp;
                }
                curr=curr.next;
            }
            i=i.next;
        }
        return head;      */    







    //Merge sort 
         

        if(head==null || head.next==null){
            return head;
        }
        ListNode left=null;
        ListNode right=null;
        if(head.next.next==null){
            right=sortList(head.next);
            head.next=null;
            left=sortList(head);
        }
        else{
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode temp=slow.next;
            slow.next=null;
            left=sortList(head);
            right=sortList(temp);
        }
            return merge(left,right);

    }
        
    public ListNode merge(ListNode curr1,ListNode curr2){
        if(curr1==null){
            return curr2;
        }
        if(curr2==null){
            return curr1;
        }
        if(curr1.val<curr2.val){
            curr1.next=merge(curr1.next,curr2);
            return curr1;
        }
        else{
            curr2.next=merge(curr1,curr2.next);
            return curr2;
        }
    }
}

          





/*

       public ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }

            temp = temp.next;
        }

        if (left != null)
            temp.next = left;

        if (right != null)
            temp.next = right;

        return dummy.next;
    }
}               */