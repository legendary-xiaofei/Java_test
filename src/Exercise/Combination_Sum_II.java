package Exercise;

import E100_High_Fequence.ListSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> lists=new ArrayList<List<Integer>>();
        List<Integer>list=new ArrayList<Integer>();
        //排序
        Arrays.sort(candidates);
        search(lists,list,candidates,0,target);
        return lists;
    }

    public void search(List<List<Integer>> lists,List<Integer> list,int [] candidates,int start,int target){
        if (target==0){

            lists.add(list);
            return;
        }
        if (target<candidates[0])return;
        while (start<candidates.length&&target>=candidates[start]){

            List<Integer>list1=new ArrayList<>(list);
            list1.add(candidates[start]);

            search(lists,list1,candidates,start+1,target-candidates[start]);

            int q=start;
            while (q+1<candidates.length&&candidates[start]==candidates[q+1]){
                q++;
            }
            if (q>start){

                start=q+1;
                if (q==candidates.length-1){
                    break;
                }
            } else {
                start++;
            }
        }
    }
    public void find(List<List<Integer>> listAll,List<Integer> tmp,int[] candidates, int target,int num){
        //递归的终点
        if(target==0){
            listAll.add(tmp);
            return;
        }
        if(target<candidates[0]) return;
        while(num<candidates.length&&candidates[num]<=target){
            //深拷贝
            List<Integer> list=new ArrayList<>(tmp);
            list.add(candidates[num]);
            //将num+1传递，避免使用重复数字
            find(listAll,list,candidates,target-candidates[num],num+1);
            int q=num;
            while(q+1<candidates.length&&candidates[num]==candidates[q+1]){
                q++;
            }
            //若是有重复的数字出现，为了避免结果重复，只需要对第一个数字进行find即可，因为第一个的find的结果，会把之后的结果全部覆盖
            if(q>num){
                num=q+1;
                if(q==candidates.length-1){
                    break;
                }
            }else{
                num++;
            }
        }
    }
}
