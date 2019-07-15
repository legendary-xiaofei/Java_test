package E100_High_Fequence;

public class Subarray_Sum_Equals_K {

    public int subarraySum(int[] nums, int k) {

        int result=0;
        int sum=0;
        if (nums.length==1){
            return k==nums[0]?1:0;
        }

        for (int i=0;i<nums.length;i++){
            sum=0;
            for (int j=i;j<nums.length;j++){

                sum+=nums[j];
                if (sum==k)
                    result++;
            }

        }
        return result;
    }

}
