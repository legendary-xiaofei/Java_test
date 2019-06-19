package Exercise;

public class Look_for_the_median {


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double result=0;
        int m=0,n=0;
        boolean has_two=false;
        int key = 0;
        int sum_length=nums1.length+nums2.length;
        key=sum_length/2;
        int []temp=new int[sum_length];
        if (sum_length % 2 == 0) {
            has_two=true;
        }
        else {
            key++;
        }

        if (nums1.length==0&&sum_length>0){

            if (has_two){
                result =(double) (nums2[key]+nums2[key-1])/2;
                return result;
            }else {
                result=(double)nums2[key-1];
                return result;
            }

        }
        else if (nums2.length==0&&sum_length>0){

            if (has_two){
                result =(double) (nums1[key]+nums1[key-1])/2;
                return result;
            }else {
                result=(double)nums1[key-1];
                return result;
            }
        }
        else if (sum_length==0){

            return 0;
        }
//        else {
//            if (nums1[0]>nums2[0]){
//
//                temp=nums1;
//                nums1=nums2;
//                nums2=temp;
//            }
//        }
        int count=0;
        while (key+1!=0){
            if (n<=nums2.length-1&&m<=nums1.length-1){
                if (nums1[m] <= nums2[n]) {
                    temp[count]=nums1[m];
                    m++;
                } else {
                    temp[count]=nums2[n];
                    n++;
                }
            }
            else if (n==nums2.length&&m<=nums1.length-1){
                temp[count]=nums1[m];
                    m++;
                }
            else if (m==nums1.length&&n<=nums2.length-1) {
                temp[count]=nums2[n];
                n++;
            }
            count++;
            key--;
        }
        if (has_two){
//            result=(double) (nums1[m]+nums2[n])/2;

            result=(double)(temp[sum_length/2]+temp[sum_length/2-1])/2;
        }
        else {
//            if (nums1[m]<=nums2[n]){
//                result=nums1[m];
//            }else {
//                result=nums2[n];
//            }

            result=(double)temp[sum_length/2];
        }

        return result;
    }
}
