package DP;

public class Best_time_to_buy_and_sell {
    public int maxProfit(int []prices){
        int n=prices.length;
        if (n<=0){

            return 0;
        }
        int min=prices[0];
        int res=0;

        for (int i=1;i<n;i++){

            res=res>prices[i]-min? res:prices[i]-min;
            if (min>prices[i]){
                min=prices[i];
            }
        }
        return res;
    }


    private int max2(int []prices){
        int n=prices.length;
        int res=0;
        if (n<=0){
            return 0;
        }
        for (int i=1;i<n;i++){

            if (prices[i]-prices[i-1]>0){

                res+=prices[i]-prices[i-1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int []te={7,1,5,3,6,4};
        System.out.println("结果是："+new Best_time_to_buy_and_sell().max2(te));
    }
}
