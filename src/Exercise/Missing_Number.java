package Exercise;

public class Missing_Number {
    /**
     * 给定一个包含n个正整数的数组,理应包含从0到n,一共n+1个数,但是少了其中一个
     * 请找出其中缺少哪个数
     *
     * 如给定{3,0,1}那么输出:2
     *
     * @param nums 给定的数组
     * @return 返回数组中缺少的数字
     */

    public int missingNumber(int[] nums) {

        int temp=nums.length;
        for(int i=0;i<nums.length;i++){

            temp^=i^nums[i];
        }
        return temp;
    }

}
