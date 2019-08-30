package wangyi;

import java.util.Scanner;

public class M {

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        if (n<=0)
            return;
        int[]num=new int[n];
        int []result=new int[n];

        for (int i=0;i<n;i++){

            num[i]=cin.nextInt();
        }
        for (int i=0;i<n;i++){
            result[i]=n+1-num[i];
            System.out.print(result[i]+" ");
        }
    }
}
