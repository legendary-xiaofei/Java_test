package E100_High_Fequence;

import javax.print.attribute.standard.NumberUp;
import java.util.Arrays;

public class Maximum_Length_of_Pair_Chain {
    /**
     * 646. 最长数对链
     * 给出 n 个数对。 在每一个数对中，第一个数字总是比第二个数字小。
     *
     * 现在，我们定义一种跟随关系，当且仅当 b < c 时，数对(c, d) 才可以跟在 (a, b) 后面。我们用这种形式来构造一个数对链。
     *
     * 给定一个对数集合，找出能够形成的最长数对链的长度。你不需要用到所有的数对，你可以以任何顺序选择其中的一些数对来构造。
     *
     * 示例 :
     *
     * 输入: [[1,2], [2,3], [3,4]]
     * 输出: 2
     * 解释: 最长的数对链是 [1,2] -> [3,4]
     *
     * 来源：力扣（LeetCode）

     * 测试用例：int [][]test5={{7,9},{4,5},{7,9},{-7,-1},{0,10},{3,10},{3,6},{2,3}};
     *
     * 测试用例：int [][]test2={{-10,-8},{8,9},{-5,0},{6,10},{-6,-4},{1,7},{9,10},{-4,7}};
     *
     * 排序后：int [][]test3={{-10,-8},{-6,-4},{-5,0},{-4,7},{1,7},{6,10},{8,9},{9,10}};
     *
     * 排序后：int [][]test4={{-10,-8},{-6,-4},{-5,0},{-4,7},{1,7},{8,9},{6,10},{9,10}};
     */
    public int findLongestChain(int[][] pairs) {
//        int temp=1,result=1;
//        for (int i=0;i<pairs.length;i++){
//            int max=pairs[i][1];
//            int min=pairs[i][0];
//            temp=1;
//            for (int j=0;j<i;j++){
//                if (pairs[j][0]>max){
//                    temp++;
//                    max=pairs[j][1];
////                    min=pairs[j][0];
//                }
//                else if (pairs[j][1]<min){
//                    temp++;
////                    max=pairs[][];
//                    min=pairs[j][0];
//                }
//            }
//
//            System.out.println("L("+i+")="+temp);
//            if (temp>=result)
//            {
//                result=temp;
//            }
//        }
//        return result;

        pairs=array_sort(pairs,1);
        int result=1;
        for (int i=0;i<pairs.length;i++){
            int temp=1;
            int max=pairs[i][1];
            int min=pairs[i][0];
            for (int j=i+1;j<pairs.length;j++){

                if (pairs[j][0]>max){
                    max=pairs[j][1];
                    temp++;
                }
                if (temp>result){

                    result=temp;
                }

            }

        }

        return result;
    }


    private static int [][] array_sort(int[] []nums,int k) {//按照二维数组每行的第k个元素进行升序排列
        int []temp;
        for (int i=0;i<nums.length;i++){

            for (int j=0;j<nums.length-1-i;j++){
                if (nums[j][k]>nums[j+1][k]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;

    }
}

