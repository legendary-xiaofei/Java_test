package Sort_algorithm;

public class Maopao {

    public int[] maopaopaixu(int []nums){
        int temp;
        for (int i=0;i<nums.length;i++){

            for (int j=i;j<nums.length-1;j++){

                if (nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}
