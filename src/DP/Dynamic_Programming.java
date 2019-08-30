package DP;

public class Dynamic_Programming{

    /**
     * 打家劫舍
     * @param nums
     * @return
     */
    public int rob(int[] nums) {

        int []opt=new int[nums.length];

        if (nums.length==0)return 0;
        if (nums.length==1)return nums[0];

        opt[0]=nums[0];
        opt[1]=nums[0]>nums[1]?nums[0]:nums[1];

        for (int i=2;i<nums.length;i++){

            opt[i]=(opt[i-2]+nums[i])>(opt[i-1])?(opt[i-2]+nums[i]):(opt[i-1]);

        }

        return opt[opt.length-1];
    }

    public int rob_II(int[] nums){

        if (nums.length==0)return 0;
        if (nums.length==1) return nums[0];
        if (nums.length==2) return Math.max(nums[0],nums[1]);
        if (nums.length==3)return Math.max(nums[1],Math.max(nums[0],nums[2]));

        int []opt=new int[nums.length-1];
        int []opt2=new int[nums.length-1];

        opt[0]=nums[0];
        opt[1]=Math.max(nums[0],nums[1]);

        opt2[0]=nums[1];

        opt2[1]=Math.max(nums[1],nums[2]);

        for (int i=2;i<nums.length-1;i++){
            opt[i]=Math.max(opt[i-1],(opt[i-2]+nums[i]));
            opt2[i]=Math.max(opt2[i-1],(opt2[i-2]+nums[i+1])); }

        opt2[nums.length-1-1]= Math.max(opt2[nums.length-1-2],nums[nums.length-1]+opt2[nums.length-1-3]);

        return Math.max(opt[opt.length-1],opt2[opt2.length-1]);
    }
}
