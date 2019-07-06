package Bishi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Toutiao2 {

    public static void main(String[] args) {
        String dateStr = "2012-3-12";
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String ss[] = new String[t];
        for(int i = 0; i < t; i++){
            String y = sc.next();
            String m = sc.next();
            String d = sc.next();
            String dateStr2 = y+"-"+m+"-"+d;
            ss[i] = dateStr2;
        }
        for(int i = 0; i < t; i++){
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
            try
            {
                Date date2 = format.parse(ss[i]);
                Date date = format.parse(dateStr);
                System.out.println(differentDaysByMillisecond(date,date2));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    public static int differentDaysByMillisecond(Date date1,Date date2)
    {
        int days = (int) ((date2.getTime() - date1.getTime()) / (1000*3600*24));
        return days;
    }

}




//     public static void main(String[] args) {

//         Scanner cin=new Scanner(System.in);
//         Scanner scanner=new Scanner(System.in);
//         int T =cin.nextInt();
//         String []temp=new String[T];
//         int [][]data=new int[T][3];
//         for (int i=0;i<T;i++){
//             temp[i]=scanner.nextLine();
//         }
//         for (int i=0;i<T;i++){
//             int count=0;
//             for (String s:temp[i].split(" ")
//                  ) {
//                 data[i][count++]=Integer.parseInt(s);
//             }
//         }



    //     }

