package Exercise;

import java.util.Stack;

public class LeetCode20 {
    public boolean isValid(String s) {

        if (s.equals(""))
            return true;
        if (s.length()<=0)
            return false;
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){

            if (s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));

            }
            else if (stack.size()>0)
                switch (s.charAt(i)){
                    case '}':
                        if (stack.peek()=='{')
                            stack.pop();
                        break;

                    case ')':
                        if (stack.peek()=='(')
                            stack.pop();
                        break;
                    case ']':
                        if (stack.peek()=='[')
                            stack.pop();
                        break;
                    default:
                        break;
                }

        }

        return stack.size()==0;
    }
}
