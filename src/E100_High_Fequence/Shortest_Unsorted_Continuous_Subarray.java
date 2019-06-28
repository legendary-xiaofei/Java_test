package E100_High_Fequence;

/**
 * 寻找最短的子数组，在给定的数组中寻找最短的子数组的长度，使得将该子数组排序后，整个数组呈升序排列。
 *
 * 测试用例：
 *         int []test={2,6,4,8,10,9,15};    期望输出：5
 *         int []test2={1,2,3,4,5};         期望输出：0
 *         int []test3={2,1};               期望输出：2
 *         int []test4={5,4,3,2,1};         期望输出：5
 *         int []test5={1,3,2,2,2};         ……
 *         int []test6={1,3,2,3,3};
 *         int []test7={2,3,3,2,4};
 *         int []test8={1,2,4,5,3};
 *
 *
 */
public class Shortest_Unsorted_Continuous_Subarray {

    public int findUnsortedSubarray(int[] nums) {
        int noMinIdx = -1;
        int min = nums[nums.length -1];
        int noMaxIdx = -1;
        int max = nums[0];
        for(int i = nums.length-2;i>-1;i--) {//从后向前找，从后向前的序列中最小的元素，而且锁定最后一个比当前序列最小元素大的元素位置

            if (nums[i]>min) {
                noMinIdx = i;
            }else {
                min = nums[i];
            }
        }
        if (noMinIdx == -1) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {//从前向后找，从前向后的序列中最大的元素，而且锁定第一个比当前最大元素小的元素

            if (nums[i]<max) {
                noMaxIdx = i;
            }else {
                max = nums[i];
            }
        }
        System.out.println("noMinIdx:"+noMinIdx);
        System.out.println("noMaxIdx:"+noMaxIdx);
        return noMaxIdx - noMinIdx + 1;
    }
}
