package E100_High_Fequence;

public class MergeTrees {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x){
            val=x;
        }
    }
    private TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if (t2==null){
            return t1;
        }
        if (t1==null){

            return t2;
        }
        TreeNode temp=new TreeNode(t1.val+t2.val);
        temp.left=mergeTrees(t1.left,t2.left);
        temp.right=mergeTrees(t1.right,t2.right);

        return temp;
    }
}
