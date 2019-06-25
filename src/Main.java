
import E100_High_Fequence.*;
import Exercise.Look_for_the_median;

import java.util.*;

public class Main {

     public static void main(String[] args) {


//    int [][]test={{0,1},{2,3},{1,2},{3,0}};
//    int [][]tes={{1,0},{0,2},{2,1}};
        int []test={2,6,4,8,10,9,15};
        int []test2={1,2,3,4,5};
        int []test3={2,1};
        int []test4={5,4,3,2,1};
        int []test5={1,3,2,2,2};
        int []test6={1,3,2,3,3};
        int []test7={2,3,3,2,4};
        int []test8={1,2,4,5,3};
//         System.out.println(new Look_for_the_median().findMedianSortedArrays(num1,num2));
          System.out.println(new Shortest_Unsorted_Continuous_Subarray().findUnsortedSubarray(test8));
     }


}
