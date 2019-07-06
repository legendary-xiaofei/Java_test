package DataStructure;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.PrimitiveIterator;
import java.util.Stack;

public class Binary_Tree {
    /**
     * 测试用例：
     *          Binary_Tree root=new Binary_Tree(1);
     *          root.left=new Binary_Tree(2);
     *          root.right=new Binary_Tree(3);
     *
     *          root.left.left=new Binary_Tree(4);
     *          root.left.right=new Binary_Tree(5);
     *
     *          root.right.left=new Binary_Tree(6);
     *          root.right.right=new Binary_Tree(7);
     *
     *          调用：
     *          root.InOrder_noR_last(root);
     *
     *
     */

    public int val;
    public Binary_Tree left=null;
    public Binary_Tree right=null;
    public Binary_Tree(int val){
        this.val=val;
    }

    /**
     * 先序递归遍历
     * @param root
     */
    public void InOrder(Binary_Tree root){
        if (root==null)return;
        System.out.print(root.val+" ");
        InOrder(root.left);
        InOrder(root.right);
    }

    /**
     * 中序非递归遍历
     * @param root
     */
    public void InOrder_noR(Binary_Tree root){
        Stack<Binary_Tree> stack=new Stack<>();
        Binary_Tree tre=root;
        if (root==null)return;
        stack.push(tre);
        while (!stack.empty()){

            if (tre!=null&&tre.left!=null){
                stack.push(tre.left);
                tre=tre.left;
            }else {
                tre=stack.pop();
                System.out.print(tre.val+" ");
                if (tre.right!=null){

                    stack.push(tre.right);
                    tre=tre.right;
                }
                else {
                    tre=null;
                }
            }
        }
    }

    /**
     * 先序非递归遍历
     * @param root
     */
    public void InOrder_noR_first(Binary_Tree root){
        Stack<Binary_Tree>stack=new Stack<>();
        Binary_Tree tre=root;
        if (root==null)return;

        while (!stack.empty()||tre!=null){
           if (tre!=null){
                System.out.print(tre.val+" ");
                stack.push(tre);
                tre=tre.left;
            }
           else if (!stack.empty()){

                tre=stack.pop();
                tre=tre.right;
            }
            }
        }

    /**
     * 中序非递归遍历
     * @param root
     */
    public void InOrder_noR_mid(Binary_Tree root){

        Stack<Binary_Tree>stack =new Stack<>();
        Binary_Tree tre=root;
        if (tre==null)return;
        stack.push(tre);
        while (!stack.empty()){

            if (tre!=null&&tre.left!=null){
                tre=tre.left;
                stack.push(tre);
            }else {

                tre=stack.pop();
                System.out.print(tre.val+" ");
                if (tre.right!=null){
                    stack.push(tre.right);
                    tre=tre.right;
                }else {
                    tre=tre.right;
                }
            }


        }
    }


    /**
     * 后序非递归遍历
      * @param root
     */
    public void InOrder_noR_last(Binary_Tree root){

        Stack<Binary_Tree> stack=new Stack<>();
        Stack<Binary_Tree> stack1=new Stack<>();
        Binary_Tree tre=root;

        while (tre!=null||!stack.empty()){
            if (tre!=null){
                stack.push(tre);
                stack1.push(tre);
                tre=tre.right;
            }else {
                tre=stack.pop();
                tre=tre.left;
            }
        }
        while (stack1.size()>0){

            Binary_Tree n=stack1.pop();
            System.out.print(n.val+" ");
        }
        }
}

