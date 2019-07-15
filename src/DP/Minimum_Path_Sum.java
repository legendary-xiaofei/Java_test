package DP;

public class Minimum_Path_Sum {

    /**
     * 题目描述：给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
     *
     * 说明：每次只能向下或者向右移动一步。
     *
     * 思路:典型的动态规划问题
     *
     * 测试用例：int [][]test={{1,3,1},{1,5,1},{4,2,1}};
     *
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {

        int [][]dp=new int[grid.length][grid[0].length];
        dp[0][0]=grid[0][0];

        for (int i=0;i<grid.length;i++){

            for (int j=0;j<grid[i].length;j++){

                if (i==0){
                    if (j>0)
                    dp[i][j]=dp[i][j-1]+grid[i][j];
                }
                else if (j==0){
                       dp[i][j]=dp[i-1][j]+grid[i][j];
                }
                else {

                    dp[i][j]=Math.min(dp[i][j-1]+grid[i][j],dp[i-1][j]+grid[i][j]);
                }
            }
        }
//        for (int []array:dp
//             ) {
//            for (int i:array)
//                System.out.print(i+"\t");
//            System.out.println();
//        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
