import DP.Minimum_Path_Sum;
import E100_High_Fequence.Unique_Paths;

public class Main {

     public static void main(String[] args) {

          int [][]test={{1,3,1},{1,5,1},{4,2,1}};
          int[][]test2={{1,0}};


          int [][]test3={{0,0},{1,1},{0,0}};
          int [][]test4={{0,1,0},{0,1,0}};
          int [][]test5={{0,0},{1,0}};
//          System.out.println("高是"+test2.length);
//          System.out.println("宽是"+test2[0].length);
          System.out.print(new Minimum_Path_Sum().minPathSum(test));
     }


}

