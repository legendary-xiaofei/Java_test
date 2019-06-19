package E100_High_Fequence;

public class ListSort {
    /**
     *测试用例
     ListSort.ListNode listNode1 =new ListSort.ListNode(4);
     ListSort.ListNode listNode2 =new ListSort.ListNode(2);
     ListSort.ListNode listNode3 =new ListSort.ListNode(1);
     ListSort.ListNode listNode4=new ListSort.ListNode(3);

     listNode1.next=listNode2;
     listNode2.next=listNode3;
     listNode3.next=listNode4;
     listNode4.next=null;
     */
    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode sortList(ListNode head) {

        return head == null ? null : mergeSort(head);
    }

    /**
     * 排序
     * @param head
     * @return
     */
    private ListNode mergeSort(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode p = head, q = head, pre = null;
        /**
         *
         * 快慢指针找链表中点
         * 快指针跳到终点时，慢指针正好跳到链表的一半
         */
        while (q != null && q.next != null) {
            pre = p;
            p = p.next;
            q = q.next.next;
        }
        pre.next = null;
        ListNode l = mergeSort(head);
        ListNode r = mergeSort(p);
        return merge(l, r);
    }

    /**
     * 合并的过程
     * @param l
     * @param r
     * @return
     */
    ListNode merge(ListNode l,ListNode r){
        ListNode temp=new ListNode(0);
        ListNode temp_h=temp;

        while (l!=null&&r!=null){
            if (l.val>r.val){
                temp_h.next=r;
                temp_h=temp_h.next;
                r=r.next;
            }
            else {
                temp_h.next=l;
                temp_h=temp_h.next;
                l=l.next;
            }

            if (l==null){

                temp_h.next=r;
            }
            else {
                temp_h.next=l;
            }
        }
      return temp.next;
    }
}