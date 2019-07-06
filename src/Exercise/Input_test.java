package Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Input_test {


    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        Scanner scanner=new Scanner(System.in);
        String []data=new String [n];
        for (int i=0;i<n;i++){
            data [i]=scanner.nextLine();
        }
        ArrayList<Integer>[] arrayLists= new ArrayList[n];
        for (int i=0;i<n;i++){
            String [] temp=data[i].split(" ");
            arrayLists[i]=new ArrayList<>();
            for (String s : temp) {
                arrayLists[i].add(Integer.parseInt(s));
            }
        }
        for(int i=0;i<n;i++){

            for (int j=0;j<arrayLists[i].size();j++){
                System.out.print(arrayLists[i].get(j));
            }
            System.out.println();
        }
    }
}
