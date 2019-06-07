import E100道高频.Daily_Temperatures;
import Exercise.Find_Mode_in_Binary_Search_Tree;


public class Main {

     public static void main(String[] args) {


     }


    public static void tes( String s,int k){
        if (k<=s.length()){
            String s1=s.substring(k);
            System.out.println(s1);
            tes(s1,1);
        }
    }


}
