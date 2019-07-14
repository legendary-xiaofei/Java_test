package DP;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Stack;

public class Longest_Valid_Parentheses {

    public int longestValidParentheses(String s) {//用栈的方式来解决的
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;

    }

    public static void main(String[] args) {
        String s="((()))";
        System.out.println(new Longest_Valid_Parentheses().longestValidParentheses(s));

    }
}
