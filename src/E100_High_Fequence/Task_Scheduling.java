package E100_High_Fequence;

import java.util.HashMap;

public class Task_Scheduling {
    /**
     * 测试用例: char[] tes={'A','A','A','B','B','B'};
     * @param tasks  传进去的任务
     * @param n     返回任务调度的最短时长
     * @return
     */
    public int leastInterval(char[] tasks, int n) {
        int temp=0;
        int max=0;
        HashMap<Character,Integer> hashMap=new HashMap<>();
        /**
         *计算给出任务中，出现频率最高的任务，并将该任务出现的频率记为max
         * 最长执行时间为(max-1)*(n+1)+maxCount
         * 此处这个maxCount是因为可能会有频率相同，而且都是最高的情况，
         * 比如题干测试用例；
         */
        for (char task : tasks) {

            if (hashMap.get(task)==null){

                hashMap.put(task,1);
            }
            else {
                temp=hashMap.get(task);
                if (temp>max){
                    max=temp+1;
                }
                hashMap.replace(task,temp+1);
            }
        }
        int maxCount=0;//频率相同的最高任务数量，比如task={'A','A','A','B','B','B'},此时maxCount=2;
        for (char c:hashMap.keySet()) {
            if (hashMap.get(c)==max){
                maxCount++;
            }
        }
        if ((max - 1) * (n + 1) + maxCount>=tasks.length){

            return (max -1)*(n+1)+maxCount;
        }else {

            return tasks.length;
        }

    }

}
