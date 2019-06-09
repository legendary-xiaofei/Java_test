package E100_High_Fequence;

/**
 *根据每日气温列表，请重新生成一个列表，对应位置的输入是你需要再等待多久温度才会升高的天数。如果之后都不会升高，请输入 0 来代替。
 *
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 *  测试用例: int test[]={73, 74, 75, 71, 69, 72, 76, 73}
 */

public class Daily_Temperatures {

    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        boolean isfound=false;
        for (int i=0;i<T.length;i++){
            for (int j=i+1;j<T.length;j++){
                if (T[j]>T[i])
                {
                    result[i]=j-i;
                    isfound=true;
                }
                if (isfound){
                    isfound=false;
                    break;
                }else {
                    result[i]=0;
                }

            }
        }
        return result;
    }
}
