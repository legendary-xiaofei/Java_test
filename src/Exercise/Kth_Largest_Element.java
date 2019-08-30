package Exercise;

import java.util.Arrays;

public class Kth_Largest_Element {
    private void heapify(int[]nums,int n,int i){
        if (i>=n) return;
        int max=i;
        int lchild=2*i+1;
        int rchild=2*i+2;
        if (lchild<n&&nums[max]<nums[lchild])
            max=lchild;
        if (rchild<n&&nums[max]<nums[rchild])
            max=rchild;

        if (max!=i){
            swap(nums,max,i);

            heapify(nums,n,max);
        }
    }


    public void build(int []nums){
        int len=nums.length;
        int parent=(len-1)/2;
        for(int i=parent;i>=0;i--){
            heapify(nums,len,i);
        }

    }

    public int heapsort(int []nums,int index){
        build(nums);
        if (index>=0&&index<nums.length){
            for (int i=nums.length-1;i>nums.length-1-index;i--){

                swap(nums,0,i);
                heapify(nums,i,0);

            }
            return nums[nums.length-index];
        }

        return -1;

    }
    private void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int []test={3,2,1,5,6,4};

        int result=new Kth_Largest_Element().heapsort(test,2);
        for (int i:test)
            System.out.print(i+" ");
    }
}
