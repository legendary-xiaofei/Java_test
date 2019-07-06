package E100_High_Fequence;

import java.util.List;

public class Reverse_Linked_List {
    /**
     *
     Reverse_Linked_List.ListNode listNode1=new Reverse_Linked_List.ListNode(1);
     Reverse_Linked_List.ListNode listNode2=new Reverse_Linked_List.ListNode(2);
     Reverse_Linked_List.ListNode listNode3=new Reverse_Linked_List.ListNode(3);
     Reverse_Linked_List.ListNode listNode4=new Reverse_Linked_List.ListNode(4);
     Reverse_Linked_List.ListNode listNode5=new Reverse_Linked_List.ListNode(5);

     listNode1.next=listNode2;
     listNode2.next=listNode3;
     listNode3.next=listNode4;
     listNode4.next=listNode5;
     listNode5.next=null;
     */

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev= null;
        ListNode curr=head;
        while (curr!=null){

            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}