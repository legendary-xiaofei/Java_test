package Exercise;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.HeaderTokenizer;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

public class LeetCode143 {

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = null;
        fun(listNode);
    }

    private static void fun(ListNode head) {
        if (head == null || head.next == null)
            return;
        ListNode left = head;
        ListNode pre;
        while (left != null && left != found(head)) {

            ListNode last = found(head);
            ListNode toail = last.next;
            pre = left;
            left = left.next;
            pre.next = toail;
            last.next = null;
            toail.next = left;
            if (left == last)
                break;

        }
        ListNode h = head;
        while (h != null) {
            System.out.print(h.val + " ");
            h = h.next;
        }

    }

    private static ListNode found(ListNode head) {//寻找尾指针的上一个节点
        ListNode listNode = head;
        ListNode re;
        if (listNode.next == null)
            return null;
        else {
            re = listNode;
            listNode = listNode.next;
        }
        while (listNode.next != null) {
            re = listNode;
            listNode = listNode.next;
        }
        return re;
    }
}
