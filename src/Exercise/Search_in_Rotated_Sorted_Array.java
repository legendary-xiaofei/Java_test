package Exercise;

public class Search_in_Rotated_Sorted_Array {

    public int search(int[] nums, int target) {
        int res=-1;
        int first;
        int key=0;
        int last=nums.length-1;
        if (nums.length<=0)return res;
        if (nums[0]==target)return 0;
        for (int i=1;i<nums.length;i++){

            if (nums[i]==target){
                res=i;
            }
            else if (nums[i]<nums[i-1]){
                key=i;
                break;
            }
        }
        first=key;
        while (first<=last){
            int mid=(last+first)/2;
            if (nums[mid]==target){
                res=mid;
                break;
            }
            else if (nums[mid]>target){

                last=mid-1;
            }
            else {
                first=mid+1;
            }
        }
        return res;
    }
}
