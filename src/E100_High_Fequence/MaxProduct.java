package E100_High_Fequence;
public class MaxProduct {

    public int maxProduct(int []nums){
        /**
         * 最蠢的方式，暴力循环的方法
         */
//        int max =nums[0];
//        int temp;
//        for (int i=0;i<nums.length;i++){
//            temp=nums[i];
//            if (max<nums[i]) {max=nums[i];}
//            if (i<nums.length-1){
//                for (int j=i+1;j<nums.length;j++){
//                    temp*=nums[j];
//                    if (temp>max) max=temp;
//                }
//            }
//            else {
//                if (max<nums[nums.length-1]) max=nums[nums.length-1];
//            }
//            }
//            return max;
/**
 * 方式二
 */
        if(nums.length==1){
            return nums[0];
        }
        int maxnum=nums[0];
        int minnum=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            int maxnum_tmp=maxnum;
            int minnum_tmp=minnum;
            maxnum=max(nums[i],max(nums[i]*maxnum_tmp,nums[i]*minnum_tmp));
            minnum=min(nums[i],min(nums[i]*maxnum_tmp,nums[i]*minnum_tmp));
            res=max(res,maxnum);
        }
        return res;
    }

    private int max(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }
    private int min(int a, int b){
        if(a>b){
            return b;
        }
        return a;
    }
}
