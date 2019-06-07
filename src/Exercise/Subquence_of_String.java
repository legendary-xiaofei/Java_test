package Exercise;

public class Subquence_of_String {
    /**
     *
     * 打印字符串（包括空串在内）的所有子序列
     * 调用案例：printAllSub("12".toCharArray(),0,"");
     * @param str 将字符串转化为字符数组
     * @param i 调用时，从0开始
     * @param res 当前结果串
     */

    public static void printAllSub(char[] str, int i, String res) {
        if (i == str.length) {
            System.out.println(res);
            return ;
        } else {

            printAllSub(str, i + 1, res); // 不要下标为i+1的字符
            printAllSub(str, i + 1, res+str[i]); // 要第i+1个字符
        }
    }
}
