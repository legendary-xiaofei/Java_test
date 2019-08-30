package Exercise;

public class Leetcode19 {

    private static class ListNode{

        int val;
        ListNode next;
        ListNode (int x){val=x;}

    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (head==null)
            return head;

        ListNode cur=head;

        ListNode k=head;

        while (cur!=null){

            if (n>-1){

                cur=cur.next;
                n--;
            }
            else {
                cur=cur.next;
                k=k.next;
            }

        }
        if (k.next!=null&&n==-1){

            k.next=k.next.next;
        }
        else if (n!=-1){

            return head.next;
        }
        else return null;
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(0);
        ListNode listNode3=new ListNode(2);
        listNode1.next=listNode2;
//        listNode2.next=listNode3;
        listNode2.next=null;

        System.out.println(removeNthFromEnd(listNode1,1).val);

    }
}
