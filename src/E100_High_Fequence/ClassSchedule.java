package E100_High_Fequence;
import java.util.ArrayList;
public class ClassSchedule {
   /**
    * 现在你总共有 n 门课需要选，记为 0 到 n-1。

    * 在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们: [0,1]

    * 给定课程总量以及它们的先决条件，判断是否可能完成所有课程的学习？

    * 示例 1:

    * 输入: 2, [[1,0]]
    * 输出: true
    * 解释: 总共有 2 门课程。学习课程 1 之前，你需要完成课程 0。所以这是可能的。

    * 示例 2:
    *
    *
    * 输入: 2, [[1,0],[0,1]]
    * 输出: false
    * 解释: 总共有 2 门课程。学习课程 1 之前，你需要先完成​课程 0；并且学习课程 0 之前，你还应先完成课程 1。这是不可能的。
    */
   /**
    *
    *
    * @param numCourses
    * @param prerequisites
    * @return
    * 这是别人的算法,自己的算法已经提交在leetcode中
    */
   public boolean canFinish(int numCourses, int[][] prerequisites) {

         ArrayList<Integer>[] graph = new ArrayList[numCourses];
         int[] visited = new int[numCourses]; // 0:未访问;1:已访问;-1:冲突
         // 初始化ArrayList数组
         for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<Integer>();
         }
         // 用邻接表形式构建有向图
         for (int[] pre : prerequisites) { // [0,1]表示1->0，1为前驱课程
            graph[pre[1]].add(pre[0]);
         }
         // DFS遍历有向图
         for (int i = 0; i < numCourses; i++) {
            if (!canFinishDFS(graph, visited, i)) { // 存在环
               return false;
            }
         }
         return true;
      }

   private boolean canFinishDFS (ArrayList < Integer >[]graph,int[] visited, int i){
      if (visited[i] == -1) { // 有环
         return false;
      }
      if (visited[i] == 1) {
         return true;
      }
      visited[i] = -1;
      for (int index = 0; index < graph[i].size(); index++) {
         int adj = graph[i].get(index); // 取每一组List中的各个值
         if (!canFinishDFS(graph, visited, adj)) {
            return false;
         }
      }
      visited[i] = 1;
      return true;
   }
}
/**
 * 我的算法
 * public boolean canFinish(int numCourses, int[][] prerequisites) {
 *         HashMap<Integer,Integer>hashMap=new HashMap<>();
 *       if (numCourses<=2&&prerequisites.length<2){
 *
 *          return true;
 *       }
 *       for (int j=0;j<prerequisites.length;j++){
 *          int k=prerequisites[j][0];
 *          hashMap.put(prerequisites[j][0],prerequisites[j][1]);
 *          for (int i=0;i<prerequisites.length;i++){
 *
 *             if (prerequisites[i][0]==hashMap.get(k)){
 *                hashMap.put(prerequisites[i][0],prerequisites[i][1]);
 *
 *                if (prerequisites[i][1]==k)
 *                   return false;
 *                else {
 *                  hashMap.put(k,prerequisites[i][1]);
 *                      if (hashMap.keySet().contains(prerequisites[i][1])){
 *
 *                      if(hashMap.get(prerequisites[i][1])==k){
 *
 *                         return false;
 *                      }
 *                   }
 *                }
 *             }
 *          }
 *       }
 *       return true;
 *     }
 */
