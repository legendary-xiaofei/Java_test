import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int a=123;
        int b=-12345;
        int c=1534236469;
        String s="{[]}";
        String s1="(]";
        String s2="([)]";
        String s3="(])";
        String s4="()]";
//        System.out.println(fun2(s4));
        Class class1=s1.getClass();
        try {
            Object obj=class1.newInstance();
            String s5=(String)obj;
            System.out.print(s5.length());
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    private static int fun(int num){
        int data=num;
        if (data>-9&&data<9)
            return 0;
        int temp;
        int b=0;
        while (data!=0 ){
            temp=data%10;
            if (b*10/10!=b){
                return 0;
            }
            else if (((b*10 ^ b*10+temp) & (temp ^ b*10+temp)) < 0) {
                return 0;
            }
            else
                b=b*10+temp;
            data/=10;
        }
     return b;
    }
    private static boolean fun2(String s){

        if (s.equals(""))
            return true;
        if (s.length()<=1)
            return false;
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else if (stack.size()>0){
                switch (s.charAt(i)){
                    case '}':
                        if (stack.peek()=='{')
                            stack.pop();
                        else
                            return false;
                        break;

                    case ')':
                        if (stack.peek()=='(')
                            stack.pop();
                        else
                            return false;
                        break;
                    case ']':
                        if (stack.peek()=='[')
                            stack.pop();
                        else
                            return false;
                        break;
                    default:
                        return false;
                }
            }
            else {

                return false;
            }
        }
        return stack.size()==0;
    }

}

