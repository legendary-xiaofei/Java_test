package Exercise.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class IO_test {
    public static void main(String[] args) {
        FileWriter writer=null;
        BufferedReader bufferedReader=null;

        BufferedWriter bufferedWriter=null;
        try{
            try {
                writer=new FileWriter("F://demo.txt");
                writer.write("你好世界，Hello World！\r\n");
                writer.write("AliBaba");
                writer.write("123456789");
            }finally {
                if (writer!=null)
                    writer.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        FileReader reader=null;
        try{
            reader=new FileReader("F://demo.txt");
            bufferedReader=new BufferedReader(reader);
//               if (writer!=null)
            bufferedWriter=new BufferedWriter(new FileWriter("F://feifei.txt"));


            String st;
            while ((st=bufferedReader.readLine())!=null){
                System.out.println(st);
                bufferedWriter.write(st);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();

//               int read=reader.read();
//               while (read!=-1){
//
//                    System.out.print((char)read);
//                    read=reader.read();
//               }
        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
