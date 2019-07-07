
import Sort_algorithm.QuickSort;

public class Main {

     public static void main(String[] args) {

         int[]test0={2,4,5,1,3};
         int []test1={9,8,7,6,6,4,3,2,1};
         int []test2={4,5,6,7,0,1,2};
         int []test3={1,6,7,9,10};

//         System.out.println(new Search_in_Rotated_Sorted_Array().search(te,3));
//         int mode=0x1 << 1;
//
//         System.out.print(mode);

         new QuickSort().quickSort(test1,0,test1.length-1);

         for (int i:test1
              ) {
             System.out.print(i+" ");
         }
     }

}

