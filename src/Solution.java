import javafx.scene.shape.ObservableFaceArray;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {


    /*
     * 将int类型转换为byte数组类型*/
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

    /**
     * 按照对角线顺序输出的测试用例：
     *         int [] test1={1,3,5,2,4};
     *          int [] test2={5,4,3,2,1};
     *          int [][]test3={{1,2,3},{4,5,6},{7,8,9}};//
     *          int [][]test4={{1,2},{3,4},{5,6}};
     *          int [][]test5={{3},{4}};
     *          int [][]test6={{3,4}};
     *          int [][]test7={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
     *          int [][]test8={{6,9,7}};
     *          int [][]test9={{1,2,3,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,20}};
     */
    /**
     * 按照对角线输出矩阵元素
     * @param matrix 输入的矩阵
     * @return 返回一个存有按照该顺序遍历结果的数组
     */
    public int[] findDiagonalOrder(int[][] matrix) {
        ArrayList<Integer>arrayList=new ArrayList();
        if (matrix.length>0&&matrix[0].length>0)
        for (int j=0;j<matrix.length+matrix[0].length-1;j++){
            int m=0,n=0;
            if ((j+1)%2==0){//奇数次，向左下角
                m=(matrix[0].length-j-1>=0? 0:(j+1-matrix[0].length));
                if (matrix[0].length>1&matrix.length!=1){
                    n=(matrix.length-j-1>=0? (j+1-matrix[0].length>=0? matrix[0].length-1:j):(j+1-matrix[0].length>=0?(matrix[0].length-1):j));
                }
                if (matrix.length==1){
                    n=j;
                }
                for (int i=0;i<matrix.length;i++){
                    arrayList.add(matrix[m][n]);
                    m++;
                    n--;
                    if (n<0||m==matrix.length)
                        break;
                }
            }
            else {//偶数次，向右上角
                m=(matrix.length-j-1>=0? j:matrix.length-1);
                n=(matrix.length-j-1>=0? 0:j+1-matrix.length);
                for (int i=0;i<matrix[0].length;i++){//((j+1-matrix.length)<=0 ? j+1:(matrix[0].length-(j+1-matrix.length)))
                    arrayList.add(matrix[m][n]);
                    m--;
                    n++;
                    if (m<0||n==matrix[0].length)
                    break;
                }
            }
        }
        int []result=new int [arrayList.size()];
        for (int i=0;i<arrayList.size();i++)
        {
            result[i]=arrayList.get(i);
        }
        return result;
    }

    /**
     * 将给定的数组向右移动，如nums={1,2,3,4,5},向右移动1位，result={5,1,2,3,4}
     *
     * 测试用例: int test[]={1,2,3,4,5,6};
     * @param nums 将要移动的数组
     * @param k 移动的位数
     * @return
     */

    public int[] rotate(int[] nums, int k) {
        int[] result=new int[nums.length];
        if(k!=nums.length &&k!=0){
            k=k%nums.length;

            for(int i=0;i<nums.length-k;i++){
                result[k+i]=nums[i];
            }
            for(int j=0;j<k;j++ ) {

                result[j]=nums[nums.length-k+j];
            }
        }
        else {
            result=nums;
        }
        return result;
    }

    /**
     * 冒泡法排序
     *
     * @param nums 返回排好的数据
     */
    private static void so(int []nums){
        int temp=0;
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length-1-i;j++){
                if (nums[j]>nums[j+1]){
                    temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
