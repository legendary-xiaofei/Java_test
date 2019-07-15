package Bytedance;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        Scanner scanner1=new Scanner(System.in);
        String sss=scanner1.nextLine();
        String[] ch_s=sss.split(" ");
        String []result=new String[ch_s.length];

        StringBuilder end= new StringBuilder();

        for (int i=0;i<ch_s.length;i++) {
            result[i]=Decode(ch_s[i]);
        }
        for (int i=0;i<ch_s.length-1;i++){
            end.append(result[i]).append(" ");
        }
        end.append(result[ch_s.length - 1]);
        System.out.print(end);

    }
    public static String Decode(String s){

        int len=s.length();
        String fir_st="";
        if (len<=2)return s;
        int index;
        if (len%2==0) {
            index =len/2;
        }else {
            index=(len+1)/2;
        }
        fir_st=s.substring(0,index);

        char []chars=new char[len-index];//后半部分
        for (int i=index;i<len;i++){
            chars[i-index]=s.charAt(i);
        }
        char[]chars1=fir_st.toCharArray();//前半部分

        char[]res=new char[len];//结果部分

        int count1=0;int count2=chars.length-1;
        for (int i=0;i<len;i++){

            if (i%2==0)
                res[i]=chars1[count1++];
            else
                res[i]=chars[count2--];
        }
        return String.copyValueOf(res);
    }
}

