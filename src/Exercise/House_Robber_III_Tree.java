package Exercise;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Stack;

public class House_Robber_III_Tree {

    /**
     * 在上次打劫完一条街道之后和一圈房屋后，小偷又发现了一个新的可行窃的地区。
     * 这个地区只有一个入口，我们称之为“根”。 除了“根”之外，每栋房子有且只有一个“父“房子与之相连。一番侦察之后，聪明的小偷意识到  “这个地方的所有房屋的排列类似于一棵二叉树”。
     * 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。
     *

     * 计算在不触动警报的情况下，小偷一晚能够盗取的最高金额。
     *
     */

    public static class TreeNode {

        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int x){

            val=x;
        }
    }



    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);

        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.right=new TreeNode(3);
        root.right.left=null;
        root.right.right=new TreeNode(1);


        System.out.print(rob(root));
    }


    public static void bianli(TreeNode root){


        if (root==null)
            return;

        System.out.print(root.val+" ");
        bianli(root.left);
        bianli(root.right);
    }

    /**
     * 递归方法
     * @param root
     * @return
     */
    public static int rob(TreeNode root) {

        if (root==null)return 0;

        if (root.left==null&&root.right==null)return root.val;

        if (root.left!=null&&root.right==null)//左不为空，右为空
            return Math.max(root.val+rob(root.left.right)+rob(root.left.left),rob(root.left));

        if (root.left==null)//右不为空
            return Math.max(root.val+rob(root.right.left)+rob(root.right.right),rob(root.right));

        return Math.max(root.val+rob(root.left.right)+rob(root.left.left)+rob(root.right.left)+rob(root.right.right),rob(root.left)+rob(root.right));

    }

    /**
     * 非递归方式
     */
    public static int rob_noR(TreeNode root){

        Stack<TreeNode> stack=new Stack<>();


        return 0;
    }

}
