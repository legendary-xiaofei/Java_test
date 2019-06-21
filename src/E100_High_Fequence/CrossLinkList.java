package E100_High_Fequence;

public class CrossLinkList {


    /**
     * 有两个链表,编写一个程序找到两个单链表的相交的起始节点
     */

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
            next=null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a1=headA;
        int A_len=0;
        ListNode b1=headB;
        int B_len=0;
        while (a1!=null||b1!=null){
            if (a1!=null&&b1!=null){
                a1=a1.next;
                A_len++;
                b1=b1.next;
                B_len++;
            }
            else if (a1 != null){
                a1=a1.next;
                A_len++;
            }else {
                b1=b1.next;
                B_len++;
            }
        }
        a1=headA;
        b1=headB;
        int l=Math.abs(A_len-B_len);
        if (A_len>B_len){
            while (l>0){
                a1=a1.next;
                l--;
            }
        }
        if (A_len<B_len){
            while (l>0){
                b1=b1.next;
                l--;
            }
        }
        while (a1!=null){

            if (a1==b1){

                return a1;
            }
            a1=a1.next;
            b1=b1.next;

        }
        return null;
    }
}
