package Exercise;

import java.util.Stack;

public class LeetCode234 {

    public static class ListNode{

        public int val;
        public ListNode next;
        ListNode(int x){val=x;}
    }
    public static void main(String[] args) {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(0);
        ListNode listNode3=new ListNode(2);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=null;

        System.out.println(isPalindrome(listNode1));
    }

    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        ListNode temp=head;
        while (temp!=null){
            stack.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        while (temp!=null){

            if (temp.val!=stack.pop()){

                return false;
            }
            else if (!stack.empty()){

                stack.peek();
            }
            temp=temp.next;

        }
        return true;
    }
}
