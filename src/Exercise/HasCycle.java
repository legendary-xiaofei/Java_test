package Exercise;

import java.util.ArrayList;

public class HasCycle {

    /**
     * 这个题与100道高频题目中课程表那道题相同，就是先修课的问题。
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public boolean Canfinish(int numCourses,int [][] prerequisites){

        int []visit=new int[numCourses];
        ArrayList<Integer> []graph=new ArrayList[numCourses];
        for (int i=0;i<numCourses;i++){

            graph[i]=new ArrayList<Integer>();
        }
        for (int []pre:prerequisites) {
            graph[pre[1]].add(pre[0]);
        }
        for (int i=0;i<numCourses;i++){
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
