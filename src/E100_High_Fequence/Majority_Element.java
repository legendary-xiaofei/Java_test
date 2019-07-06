package E100_High_Fequence;

import java.util.Arrays;

public class Majority_Element {
    /**
     * 给定大小为n的数组，找到其中的众数
     *众数是指在数组中出现次数大于【n/2】向上取整的元素
     *
     */
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        return nums[nums.length/2];

    }

}
