package Sort_algorithm;

public class HeapSort {
    public void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void heapify(int []nums,int n,int i){
        if (i>=n) return;//递归出口

        int max=i;
        int lchild=2*i+1;
        int rchild=2*i+2;
        if (lchild<n&&nums[lchild]>nums[max]){
            max=lchild;
        }
        if (rchild<n&&nums[rchild]>nums[max]){

            max=rchild;
        }
        if (max!=i){
            swap(nums,max,i);
            heapify(nums,n,max);
        }

    }
    public void build_heap(int []nums,int n){

        int last=n-1;
        int parent=(last-1)/2;
        for (int i=parent;i>=0;i--){

            heapify(nums,n,i);
        }

    }
    public void heapsort(int []nums,int n,int index){

        build_heap(nums,n);
        for (int i=n-1;i>n-1-index;i--){
            swap(nums,0,i);
            heapify(nums,i,0);
        }

    }

    public static void main(String[] args) {
        int []a={5,9,4,1,3};
        int [][]test={{3,3},{5,-1},{-2,2}};
        new HeapSort().heapsort(a,a.length,a.length);

        for (int i:a
             ) {
            System.out.print(i+" ");
        }
    }

    public int[][] kClosest(int[][] points, int K) {

        int []dist=new int[points.length];
        int [][]result=new int[K][2];
        for (int i=0;i<points.length;i++){

            dist[i]=(int) (Math.pow(points[i][0],2)+ Math.pow(points[i][1],2));
        }
        heapsort(dist,dist.length,K);
        int distance_K=dist[dist.length-K];
        int count=0;
        for (int i=0;i<points.length;i++){

                if ((int) (Math.pow(points[i][0],2)+ Math.pow(points[i][1],2))<=distance_K){

                    result[count++]=points[i];
                }
        }

        return result;
    }
}
