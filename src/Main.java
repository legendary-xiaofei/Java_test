import E100_High_Fequence.Maximum_Length_of_Pair_Chain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    int num = 0;
     public static void main(String[] args) {
         char c='2';

         int[]y={9,8,7,6,5,4,3,2,1};
         int [][]test={{1,2},{2,3},{3,4},{4,5}};
         int [][]test2={{-10,-8},{8,9},{-5,0},{6,10},{-6,-4},{1,7},{9,10},{-4,7}};
         int [][]test3={{-10,-8},{-6,-4},{-5,0},{-4,7},{1,7},{6,10},{8,9},{9,10}};
         int [][]test4={{-10,-8},{-6,-4},{-5,0},{-4,7},{1,7},{8,9},{6,10},{9,10}};
         int [][]test5={{7,9},{4,5},{7,9},{-7,-1},{0,10},{3,10},{3,6},{2,3}};

         System.out.println(new Maximum_Length_of_Pair_Chain().findLongestChain(test5));
//         System.out.print(Arrays.toString(array_sort(test2)));
//         so(y);


     }


    private static void so(int []nums){
         int temp=0;
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length-1-i;j++){
                if (nums[j]>nums[j+1]){
                    temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
