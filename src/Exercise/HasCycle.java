package Exercise;

import java.util.ArrayList;

public class HasCycle {

//    int [] vist=new int[3];
    public boolean Canfinish(int n,int [][] nums){

        int []visit=new int[n];
        ArrayList<Integer> []graph=new ArrayList[n];
        for (int i=0;i<n;i++){

            graph[i]=new ArrayList<Integer>();
        }
        for (int []pre:nums) {
            graph[pre[1]].add(pre[0]);
        }
        for (int i=0;i<n;i++){
            if (hasCycle(graph,visit,i)){
                return false;
            }
        }
        return true;
    }

    public boolean hasCycle(ArrayList<Integer>[]graph,int[] visit,int i){
        if (visit[i]==-1){//有环
            return true;
        }
        if (visit[i]==1){//无环
            return false;
        }
        visit[i]=-1;
        for (int index = 0; index<graph[i].size() ; index++){

            int temp=graph[i].get(index);
            if (hasCycle(graph,visit,temp)){
                return true;
            }
        }
        visit[i]=1;
        return false;
    }
}
