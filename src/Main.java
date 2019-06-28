
import E100_High_Fequence.*;
import Exercise.HasCycle;
import Exercise.Look_for_the_median;
import Sort_algorithm.Maopao;

import java.util.*;

public class Main {

     public static void main(String[] args) {


    int [][]test={{0,1},{2,3},{1,2},{3,0}};
    int [][]tes={{1,0},{0,2},{2,1}};

    int [][]test3={{0,1},{0,2},{1,2}};
    int [][]te={{1,0},{0,1}};
//         System.out.println(new Look_for_the_median().findMedianSortedArrays(num1,num2));
//          System.out.println(new Shortest_Unsorted_Continuous_Subarray().findUnsortedSubarray(test8));
//         System.out.println(new ClassSchedule().canFinish(2,te));

         System.out.println(new HasCycle().Canfinish(4,test3));
     }


}
