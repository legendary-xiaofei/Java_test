package Exercise;

public class LeetCode142 {

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(0);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        listNode.next = listNode1;
        listNode1.next = null;
//        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode1;
//        listNode4.next = listNode1;

        System.out.println(detectCycle(listNode));
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        ListNode crash = null;
        boolean hasCycle = false;
        if (head == null || head.next == null) {
            return null;
        }
        while (s != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) {
                crash = s;
                hasCycle = true;
                break;
            } else if (f == null) {
                break;
            }
        }

        if (hasCycle) {
            s = head;
            while (s != crash) {
                s = s.next;
                crash = crash.next;
            }
            return s;
        } else return null;

    }

    private boolean hasCycle(ListNode head) {

        StringBuffer stringBuffer=new StringBuffer();

        if (head == null || head.next == null) {

            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != null && fast != null) {

            if (slow == fast) {
                return true;
            } else if (fast.next == null) {
                return false;
            } else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return false;
    }

}