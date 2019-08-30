package Exercise;

public class LeetCode172 {

    public int trailingZerores(int n){
        int res=0;
        while (n>0){
            n=n/5;
            res+=n;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(new LeetCode172().trailingZerores(25));
    }
}
