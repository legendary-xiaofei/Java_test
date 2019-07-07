package Sort_algorithm;

public class QuickSort {


    public void quickSort(int []arr,int left,int right){
        if (left>=right||left>=arr.length-1)return;

        int pr_right=right;
        int base=arr[left];

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
}


