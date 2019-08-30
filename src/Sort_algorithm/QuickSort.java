package Sort_algorithm;

public class QuickSort {


    public static void quickSort(int []arr,int left,int right){

        if (left>=right||left>=arr.length-1)return;

        int pr_right=right;
        int base=arr[left];//设置的基准base，一般选取数组的第一个元素。

        while (left<=right){

            while (base<=arr[right]&&left<right){

                right--;
            }
            if (left==right){

                arr[left]=base;
                break;
            }
            arr[left]=arr[right];
            left++;
            while (base>=arr[left]&&left<right){

                left++;
            }
            if (left==right){
                arr[right]=base;
                break;
            }
            arr[right]=arr[left];
            right--;
        }

            quickSort(arr, 0, left - 1);
            quickSort(arr, left + 1, pr_right);
    }

    public static void main(String[] args) {
        /**测试用例：*/

        int[]test0={2,4,5,1,3};
        int []test1={9,8,7,6,6,4,3,2,1};
        int []test2={4,5,6,7,0,1,2};
        int []test3={1,6,7,9,10};

        quickSort(test1,0,test1.length-1);
        for (int a:test1
             ) {
            System.out.print(a+" ");
        }
    }
}


