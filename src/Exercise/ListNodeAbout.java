package Exercise;


import org.omg.CORBA.MARSHAL;

import java.util.Stack;

public class ListNodeAbout {
    public static class ListNode{
        public int val;
        public ListNode next;
        public ListNode(int x) {
            val = x;
        }
    }

    /**
     * 删除链表倒数第n个元素
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur=head;
        if (cur==null)return null;
        ListNode key=head;
        int count=n;
        while (cur.next!=null){

            while (count>0&&cur.next!=null){
                cur=cur.next;
                count--;
            }
            if (cur.next!=null){
                key=key.next;
                cur=cur.next;
            }


        }
        if (key.next!=null&&count==0)
        key.next=key.next.next;
        else if (count!=0)
            return head.next;
        else
            return null;
        return head;

    }

    /**
     * 合并有序链表
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(1);
        ListNode res=result;
        if (l1==null)
            return l2;
        else if (l2==null){
            return l1;
        }
        ListNode cur_l1=l1;
        ListNode cur_l2=l2;
            while (cur_l1!=null&&cur_l2!=null){

                if (cur_l1.val<=cur_l2.val){

                    res.next=cur_l1;
                    res=res.next;
                    cur_l1=cur_l1.next;
                }
                else {
                    res.next=cur_l2;
                    res=res.next;
                    cur_l2=cur_l2.next;
                }
            }
            if (cur_l1==null){

                res.next=cur_l2;
            }
            else
                res.next=cur_l1;
        return result.next;
    }

    /**
     * 两数之和，leetcode第2题
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode cur_l1=l1;
        ListNode cur_l2=l2;
        ListNode cur=null;
        ListNode res=null;
        cur=res;

        Stack<Integer>stack=new Stack<>();
        int count1=0;
        int count2=0;

        int i=0;
        while (cur_l1!=null){
            count1+=cur_l1.val*Math.pow(10,i++);
            cur_l1=cur_l1.next;

        }
        int j=0;
        while (cur_l2!=null){
            count2+=cur_l2.val*Math.pow(10,j++);
            cur_l2=cur_l2.next;
        }
        int add=count1+count2;
        int temp=i>j?i-1:j-1;

        int tt= (int) ((count1+count2)/Math.pow(10,temp));
        stack.push(tt);
        while (temp!=0){

            add= (int) (add-tt*Math.pow(10,temp--));

             tt= (int) (add/Math.pow(10,temp));
            stack.push(tt);

        }
        while (!stack.empty()){

            cur.next=new ListNode(stack.pop());
            cur=cur.next;
        }
        cur.next=null;

        return res;
    }
}
