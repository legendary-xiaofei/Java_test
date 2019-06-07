package Exercise;

public class Find_Mode_in_Binary_Search_Tree {
    /**
     * * Definition for a binary tree node.
     */
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
         public TreeNode(int x) { val = x; }
     }

     public void findMode(TreeNode root){
          if (root!=null)
          System.out.println(root.val);
          findMode( root.left);
          findMode(root.right);



     }
}
