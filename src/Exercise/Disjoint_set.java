package Exercise;

public class Disjoint_set {

        private  void initialize(int []nums){
            for (int i=0;i<nums.length;i++){
                nums[i]=-1;
            }
        }
        private int find(int x,int[] nums){
            int x_root=x;
            while (nums[x_root]!=-1){

                x_root=nums[x_root];
            }
            return x_root;
        }
        private boolean union(int x,int y,int []nums){
            int x_root=find(x,nums);
            int y_root=find(y,nums);
            if(x_root==y_root) {
                return false;
            }
            else {
                nums[x_root]=y_root;
                return true;
            }

        }
        public int findCircleNum(int[][] M) {
            int []parent=new int[M.length];
            int count=M.length;
            initialize(parent);
            for(int i=0;i<M.length;i++){
                for(int j=0;j<=i;j++){
                    if(M[i][j]==1)
                    {
                        if(union(i,j,parent)){
                            count--;
                        }
                    }
                }
            }
            return count;
        }
}
