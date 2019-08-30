package Exercise.Test;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int []data={5,3,10,2,56,1};
        quickSort(data,0,data.length-1);
        System.out.println(Arrays.toString(data));


        String buffer="string";
        String bus="sss";
//

        System.out.println(buffer.hashCode());
        buffer+="a";
        System.out.println(buffer.hashCode());
    }
    private static void quickSort(int[] data,int i,int j) {

        if (i>data.length||i>j)
            return;
        int base=data[i];
        int high=j;
        int low=i;
        if (i==j)
            return;

        while (high!=low){
            while (low<high&&data[high]>=base){
                high--;
            }
            if (low<high){

                data[low++]=data[high];
            }
            while (low<high&&data[low]<=base){
                low++;

            }  if (low<high){

                data[high--]=data[low];
            }
        }
        data[high]=base;

        quickSort(data,0,high-1);
        quickSort(data,high+1,j);

    }
}
