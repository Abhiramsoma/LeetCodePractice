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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        int mid=len/2 + 1;
        temp=head;
        for(int i=1;i<=mid-1;i++){
            temp=temp.next;
        }
        return temp;

        
    }    
        public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){

            ListNode nextnode=curr.next;
            
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode leftmiddle=middleNode(head);
        ListNode head2=leftmiddle.next;
        leftmiddle.next=null;
        head2=reverseList(head2);
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(temp!=null&&head2!=null){
            temp.next=head;
            head=head.next;
            temp=temp.next;
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        if(head==null) temp.next=head2;
        if(head2==null) temp.next=head;
        head=dummy.next;


    }
}