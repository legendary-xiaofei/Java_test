
import DataStructure.Binary_Tree;
import Sort_algorithm.QuickSort;

public class Main {

     public static void main(String[] args) throws InterruptedException {

         Binary_Tree root=new Binary_Tree(1);
         root.left=new Binary_Tree(2);
         root.right=new Binary_Tree(3);

         root.left.left=new Binary_Tree(4);
         root.left.right=new Binary_Tree(5);

         root.right.left=new Binary_Tree(6);
         root.right.right=new Binary_Tree(7);

         root.BinaryTreeLevelOrder(root);



     }

}

