package Sort_algorithm;

public class MergeSort {

    private void mergeSort(int []nums,int l,int r){

        if (l==r)
            return;
        int m=(l+r)/2;
        mergeSort(nums,l,m);
        mergeSort(nums,m+1,r);
        merge(nums,l,m+1,r);

    }
    private void merge(int []nums,int l,int m,int r){
        int []left=new int[m-l];
        int []right=new int[r-m+1];
        for (int i=l;i<m;i++) left[i - l] = nums[i];
        for (int i=m;i<=r;i++) right[i - m] = nums[i];

        int i=0,j=0,k=l;
        while (i<left.length&&j<right.length){
            if (left[i]<right[j]){
                nums[k++]=left[i++];
            }else {
                nums[k++]=right[j++];
            }
        }
        while (i<left.length){
            nums[k++]=left[i++];
        }
        while (j<right.length){
            nums[k++]=right[j++];
        }

    }

    public static void main(String[] args) {
        int []test={6,3,10,9};

        new MergeSort().mergeSort(test,0,test.length-1);

        for (int i:test
             ) {
            System.out.print(i +" ");
        }
    }
}
