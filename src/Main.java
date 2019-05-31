import java.util.Arrays;

public class Main {

     public static void main(String[] args) {

         int i=255;

         System.out.println((byte)(i&0xFF));
         System.out.println("其二进制为："+int2BinaryString(-3));
         System.out.println(Arrays.toString(int2ByteArray(i)));

    }
    private static byte[] int2ByteArray(int i){
        byte[] result=new byte[4];
        result[0]=(byte)((i >> 24)& 0xFF);
        result[1]=(byte)((i >> 16)& 0xFF);
        result[2]=(byte)((i >> 8)& 0xFF);
        result[3]=(byte)(i & 0xFF);
        return result;
    }
    private static String int2BinaryString(int i){
        String result;

        result =Integer.toBinaryString(i);


        return result;

    }

}
