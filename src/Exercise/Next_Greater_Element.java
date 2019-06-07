package Exercise;

public class Next_Greater_Element {

    /**

     *第496题，下一个更大元素
     * @param nums1 数组1
     * @param nums2 数组2
     * @return 结果
     */
    public int[] nextGreateElement(int[] nums1,int[] nums2){
        int [] result=new int[nums1.length];
        boolean flag=true;
        for (int i=0;i<nums1.length;i++){
            result[i]=-1;
            flag=true;
            for (int j=0;j<nums2.length;j++){
                if (flag){
                    if (nums1[i]==nums2[j]){
                        flag=false;
                        if (j==nums2.length-1)
                            break;
                    }
                }
                else {
                    if (nums1[i]<nums2[j]){
                        result[i]=nums2[j];
                        break;
                    }

                }

            }

        }

        return result;
    }
}
