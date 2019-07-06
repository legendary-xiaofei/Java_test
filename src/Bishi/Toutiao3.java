package Bishi;
import java.util.ArrayList;
import java.util.Scanner;
public class Toutiao3 {

    public void main(String []args){

        Scanner cin = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String temp1 = cin.nextLine();

        String[]ss=temp1.split(" ");
        int n=Integer.parseInt(ss[0]);
        int m=Integer.parseInt(ss[1]);
        String s=cin.nextLine();
        char[] chars=s.toCharArray();

        int [][] data=new int[m][2];

        for (int i=0;i<m;i++){
            int count=0;
            String s1=scanner.nextLine();
            for (String s2:s1.split(" ")){
                data[i][count++]=Integer.parseInt(s2);
            }
        }

        ArrayList<Integer> chongfu=new ArrayList<>();
        ArrayList<Integer> qudiao=new ArrayList<>();

        for (int i=0;i<n-1;i++){
            if (chars[i]==chars[i+1])
            {
                chongfu.add(i+1);//相同建筑之间有路要去掉
            }

        }
        for (int i=0;i<n;i++){

            for (int tt=0;tt<2;tt++) {
                if (chongfu.contains(data[i][0])&&data[i][0]==data[i][1]){
                    qudiao.add(i);
                }
            }
        }
        int [][]res=new  int[m-qudiao.size()][2];
        int cou=0;
        for (int i=0;i<m;i++){
            int co=0;
            for (int tem:data[i]){

                if (!qudiao.contains(i)){

                    res[cou++][co++]=tem;
                }
            }
        }

        ArrayList<Integer>result=new ArrayList<>();

        int start=0;
        int result_count=0;
        for (int i=start;i<res.length;){
            if (result.size()==n){

                break;
            }
            if (!result.contains(res[i][0])||!result.contains(res[i][1])){
                if (!result.contains(res[i][0])){

                    result.add(res[i][0]);
                }
                if (!result.contains(data[i][1])){

                    result.add(res[i][1]);
                }
                start=res[i][1];
            }
            else {

                start++;
            }

            result_count++;
        }

        System.out.println(result_count);

        for (int i=0;i<result.size();i++){

        }

    }
}
