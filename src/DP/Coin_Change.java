package DP;

import java.util.Arrays;

public class Coin_Change {

    public int coinChange(int[] coins, int amount) {//凑硬币，给你个目标钱数，你用最少的硬币凑出来。

        Arrays.sort(coins);
        int []dp=new int[amount+1];

        for (int i=0;i<coins.length;i++){
            Arrays.fill(dp,amount+1);
            dp[0]=0;
        }


        for (int i=1;i<amount+1;i++){
            for (int j=0;j<coins.length;j++){

                if (coins[j]<=i)
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }


        for (int i=0;i<amount+1;i++){

            System.out.print(i+"\t");
        }
        System.out.println();


            for (int a:dp
                 ) {
                System.out.print(a+"\t");
            }
            System.out.println();


            return dp[amount]==amount+1?-1:dp[amount];


//        int []dp=new int[amount+1];
//        Arrays.fill(dp,amount+1);
//        dp[0]=0;
//
//        for (int i=1;i<=amount;i++){
//            for (int j=0;j<coins.length;j++){
//
//                if (coins[j]<=i){
//                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
//                }
//            }
//
//        }
//        for (int i=0;i<amount+1;i++){
//
//            System.out.print(i+"\t");
//        }
//        System.out.println();
//        for (int a:dp
//             ) {
//            System.out.print(a+"\t");
//        }
//        System.out.println();
//        return dp[amount]>amount? -1:dp[amount];

    }
    /*
    *  int []dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;

        for (int i=1;i<=amount;i++){
            for (int j=0;j<coins.length;j++){

                if (coins[j]<=i){
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }

        }
//        for (int a:dp
//             ) {
//            System.out.print(a+"\t");
//        }
//        System.out.println();
        return dp[amount]>amount? -1:dp[amount];
    * */


    public static void main(String[] args) {
        int []coins={2,3,5};
        System.out.println(new Coin_Change().coinChange(coins,10));
    }
}
