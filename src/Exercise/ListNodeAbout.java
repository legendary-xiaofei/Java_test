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
//    测试用例
//    ListNodeAbout.ListNode listNode1=new ListNodeAbout.ListNode(9);
//    ListNodeAbout.ListNode listNode2=new ListNodeAbout.ListNode(2);
//    ListNodeAbout.ListNode listNode3=new ListNodeAbout.ListNode(0);
//    ListNodeAbout.ListNode listNode4=new ListNodeAbout.ListNode(0);
//
//    listNode3.next=null;
//    listNode4.next=null;
//    listNode1.next=null;
//
//    ListNodeAbout.ListNode listNodea=new ListNodeAbout.ListNode(1);
//    ListNodeAbout.ListNode listNodeb=new ListNodeAbout.ListNode(9);
//    ListNodeAbout.ListNode listNodec=new ListNodeAbout.ListNode(9);
//    ListNodeAbout.ListNode listNoded=new ListNodeAbout.ListNode(9);
//    ListNodeAbout.ListNode listNodee=new ListNodeAbout.ListNode(9);
//    ListNodeAbout.ListNode listNodef=new ListNodeAbout.ListNode(9);
//    ListNodeAbout.ListNode listNodeg=new ListNodeAbout.ListNode(9);
//    ListNodeAbout.ListNode listNodeh=new ListNodeAbout.ListNode(9);
//    ListNodeAbout.ListNode listNodei=new ListNodeAbout.ListNode(9);
//    ListNodeAbout.ListNode listNodej=new ListNodeAbout.ListNode(9);
//
//
//
//    listNodea.next=listNodeb;
//    listNodeb.next=listNodec;
//    listNodec.next=listNoded;
//    listNoded.next=listNodee;
//    listNodee.next=listNodef;
//    listNodef.next=listNodeg;
//    listNodeg.next=listNodeh;
//    listNodeh.next=listNodei;
//    listNodei.next=listNodej;
//    listNodej.next=null;


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
     * 链表长度在正常范围之内，不包括傻逼链表如：[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers_old(ListNode l1, ListNode l2) {

        ListNode cur_l1=l1;
        ListNode cur_l2=l2;
        ListNode cur=null;
        ListNode res=new ListNode(0);
        cur=res;
        if (l1.val==0&&l2.val==0)return res;
        long count1=0;
        long  count2=0;

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
        long  add=count1+count2;
        int temp=i>j?i-1:j-1;


        int in=1;
        long  cheng=1;
        while (add!=0){
            cheng*=10;
            long t=(add%cheng);
           int  t1=(int )(t/(cheng/10));

            cur.next=new ListNode(t1);
            add-=t1*(cheng/10);
            cur=cur.next;

        }
        cur.next=null;

        return res.next;

    }

    /**
     * 两数之和包括正常范围，和傻逼范围[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int r=0;
        ListNode cur_l1=l1;
        ListNode cur_l2=l2;
        ListNode cur=null;
        ListNode result=new ListNode(0);
        cur=result;
        int add=0;
        while (cur_l1!=null||cur_l2!=null){
            add=0;
            if (cur_l1!=null&&cur_l2!=null){
                add=r+cur_l1.val+cur_l2.val;
            }else if (cur_l1!=null){
                add=r+cur_l1.val;
            }
            else {
                add=r+cur_l2.val;
            }
            r=0;
            if (add>9){
                r=1;
            }
            cur.next=new ListNode(add%10);
            cur=cur.next;


            if (cur_l1!=null){
                cur_l1=cur_l1.next;
            }
            if (cur_l2!=null){
                cur_l2=cur_l2.next;
            }

        }
        if (add>9){
            cur.next=new ListNode(add/10);
        }

        return result.next;
    }
}
