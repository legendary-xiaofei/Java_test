package Exercise;

public class Bitwise_AND_of_Numbers_Range {

    /**
     * 给定范围 [m, n]，其中 0 <= m <= n <= 2147483647，返回此范围内所有数字的按位与（包含 m, n 两端点）。
     *
     * @param m
     * @param n
     * @return
     */

    public static int rangeBitwiseAnd(int m, int n) {

        while (m<n) {
            n=n&(n-1);
        }
        return n;
    }
}
