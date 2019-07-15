package E100_High_Fequence;

public class Unique_Paths {

    public int uniquePaths(int m, int n) {

        int [][]dp=new int[n][m];

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){

                if (i==0||j==0)
                    dp[i][j]=1;
                else {

                    dp[i][j]=dp[i-1][j]+dp[i][j-1];

                }
            }
        }
//        for (int []array:dp
//             ) {
//            for (int i:array)
//                System.out.print(i+"\t");
//            System.out.println();
//        }


        return dp[n-1][m-1];
    }

    /**
     *
     *一些特殊的测试用例
     *   int [][]test3={{0,0},{1,1},{0,0}};
     *           int [][]test4={{0,1,0},{0,1,0}};
     *           int [][]test5={{0,0},{1,0}};
     *
     *
     * @param obstacleGrid 这是带有障碍物的数组，其中障碍物处标记为1，其余空位标记为0
     * @return
     */

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int [][]dp=new int[obstacleGrid.length][obstacleGrid[0].length];

        if (obstacleGrid[0][0]==1||obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1)
            return 0;

            if (obstacleGrid.length==1){

                for (int i:obstacleGrid[0]
                     ) {
                    if (i==1)
                        return 0;
                }
            }
            if (obstacleGrid[0].length==1){

                for (int[] ints : obstacleGrid) {
                    if (ints[0] == 1)
                        return 0;
                }
            }
            boolean flag=false;
        for (int i=0;i<obstacleGrid.length;i++){

            for (int j=0;j<obstacleGrid[i].length;j++){
                if (flag){
                    dp[i][0]=0;
                }
                if (i==0||j==0){

                    if (i==0){
                        if (obstacleGrid[i][j]==1){
                            dp[i][j]=0;
                            break;
                        }else {
                            dp[i][j]=1;
                        }
                    }
                    if (j==0){
                        if (obstacleGrid[i][j]==1){
                            dp[i][j]=0;
                            flag=true;
                        }
                        else {

                            dp[i][j]=1;
                        }
                    }
                }
                else {
                    if (obstacleGrid[i][j]==1){
                        dp[i][j]=0;
                    }
                    else {
                        dp[i][j]=dp[i-1][j]+dp[i][j-1];
                    }
                }
            }
        }

//        for (int []array:dp
//             ) {
//            for (int i:array)
//                System.out.print(i+"\t");
//            System.out.println();
//        }
        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
