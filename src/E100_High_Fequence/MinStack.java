package E100_High_Fequence;
import java.util.ArrayList;
import java.util.Stack;
public class MinStack {
    private Stack<Integer>stack;
    private ArrayList<Integer> arrayList;
    private ArrayList<Integer> min;
    /** initialize your data structure here. */
    public MinStack() {
        stack=new Stack<>();
        arrayList=new ArrayList<>();
        min =new ArrayList<>();
    }
    public void push(int x) {
        stack.push(x);
        arrayList.add(x);
        if (min.size()==0){
            min.add(x);
        }else {
            if (x<min.get(min.size()-1)){
                min.add(x);
            }else {
                min.add(min.get(min.size()-1));
            }
        }
    }
    public void pop() {
        stack.pop();
        arrayList.remove(arrayList.size()-1);
        min.remove(min.size()-1);
    }
    public int top() {
        return arrayList.get(arrayList.size()-1);
    }
    public int getMin() {
        return min.get(min.size()-1);
    }
}