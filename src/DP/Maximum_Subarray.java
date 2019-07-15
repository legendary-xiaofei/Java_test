package DP;

public class Maximum_Subarray {

    public int maxSubArray(int[] nums) {

        if (nums==null)return 0;
        if (nums.length==1)return nums[0];

        int []dp=new int[nums.length];
        dp[0]=nums[0];
        int max=dp[0];

        for (int i=1;i<nums.length;i++){
            if (dp[i-1]>0){//如果前一个子序列大于0，则加上当前元素去和max进行比较
                dp[i] = dp[i-1] + nums[i];
            }else {//否则，如果是负值，就没有必要再加上之前的子序列的元素了，看当前元素有没有比max大的可能性。
                dp[i] = nums[i];
            }
            if (dp[i] > max){
                max = dp[i];
            }
        }

        return max;
    }
    public int maxSubArray2(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int n : nums) {
            sum += n;
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
