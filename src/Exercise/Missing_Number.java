package Exercise;

public class Missing_Number {

    public int missingNumber(int[] nums) {

        int temp=nums.length;
        for(int i=0;i<nums.length;i++){

            temp^=i^nums[i];
        }
        return temp;
    }

}
