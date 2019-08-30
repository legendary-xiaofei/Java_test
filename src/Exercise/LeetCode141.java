package Exercise;
public class LeetCode141 {
    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) {
            val = x;
        }
    }
    public static boolean hasCycle(ListNode head) {//判断链表是否有环

        if (head == null || head.next == null)
            return false;
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != null && fast != null) {

            if (slow == fast)
                return true;
            else if (fast.next==null){
               return false;
            }else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return false;
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
        System.out.println(hasCycle(listNode));
    }
}
