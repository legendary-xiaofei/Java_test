package DP;

import java.util.Scanner;

public class Package {//0-1背包问题
    public static void main(String[] args) {

//        30 20 35 40 ->weight
//        20 18 25 30 ->value
//        50 ->背包容量
        Scanner scanner=new Scanner(System.in);
        String []data1=scanner.nextLine().split(" ");
        String []data2=scanner.nextLine().split(" ");

        StringBuffer stringBuffer=new StringBuffer("ninni");

        int n=scanner.nextInt();
        int []weigth=new int[data2.length];
        int []value=new int[data1.length];
        for (int i=0;i<data1.length;i++){
            weigth[i]=Integer.valueOf(data1[i]);
            value[i]=Integer.valueOf(data2[i]);
        }
        System.out.print(fun(weigth,value,n));
    }

    /**
     *
     * @param weight 物品重量
     * @param value  物品的价值
     * @param n  背包的容量
     * @return
     */
    private static int fun(int []weight,int []value,int n){
        int [][]dp=new int[value.length][n+1];//第i件商品，背包容量为j时，最大价值

        for(int i=0;i<weight.length;i++){//纵向初始化
            if (weight[i]<=i)
            dp[i][0]=value[i];
        }
        for(int j=0;j<=n;j++){//横向初始化
            if (weight[0]<=j)
            dp[0][j]=value[0];
        }
        for(int i=1;i<weight.length;i++){
            for (int j=1;j<=n;j++){
                if (j<weight[i]){//如果当前容量小于当前物品
                    dp[i][j]=dp[i-1][j];
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i]]+value[i]);
                }
            }
        }
        return dp[weight.length-1][n];
    }
}