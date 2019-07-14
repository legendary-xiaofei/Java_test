package DP;

public class Longest_Palindromic_Substring {

    public String longestPalindrome(String s) {
        if(s==null||s.length()==0){
            return "";
        }
        int [] range=new int[2];
        char[] str=s.toCharArray();
        for(int i=0;i<s.length();i++){
            i=findLongest(str,i,range);
        }
        return s.substring(range[0], range[1] + 1);
    }
    public static int findLongest(char[] str,int low,int[] range){
        int high=low;
        while(high<str.length-1&&str[high+1]==str[low]){
            high++;
        }
        int ans=high;
        while(low>0&&high<str.length-1&&str[low - 1] == str[high + 1]){
            low--;
            high++;
        }
        if(high - low > range[1] - range[0]){
            range[0]=low;
            range[1]=high;
        }
        return ans;
    }


    public String ff(String s){//动态规划

        if (s.length()<=1)
            return s;

        String longest = s.charAt(0)+"";

        System.out.println("longest is " +longest.length());
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        for(int j = length-1;j>=0;j--){
            //j在前,i在后
            for(int i = j;i<length;i++){
                dp[j][i] = s.charAt(i)==s.charAt(j)&&((i-j<3)||dp[j+1][i-1]);
                if(dp[j][i]&&i-j+1>longest.length()){
                    longest = s.substring(j,i+1);
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        String s="babad";
        String s1="cbbd";
        String s2="caba";
        String s3="ac";
        String s4="aaaa";
        String ss=new Longest_Palindromic_Substring().ff(s4);



        for (char i:ss.toCharArray()){


            System.out.print(i+ " ");
        }




    }
}
