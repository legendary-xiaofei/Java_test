package Exercise;

public class Arrays_about {

    /**
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {

        if(nums==null||nums.length==0) return 0;
        int index=0;
        int count=0;
        for (int i=1;i<nums.length;i++){
            if (nums[index]!=nums[i]||(i==nums.length-1)&&count<1){
                nums[++index]=nums[i];
                count=0;
            }
            else if (nums[index]==nums[i]){
                if (count<1){
                    count++;
                    nums[++index]=nums[i];
                }
            }
        }
        for (int i=0;i<index+1;i++){

            System.out.print(nums[i]+" ");

        }
        System.out.println();
        return index+1;
    }
}
