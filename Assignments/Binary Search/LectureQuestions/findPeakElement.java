public class findPeakElement {
    //LeetCode:162: https://leetcode.com/problems/find-peak-element/description/
    public int findPeakElement(int[] nums) {
        
        int start=0;
        int end= nums.length -1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                //you are in des. part of the array
                end = mid;
            }else{
                start= mid + 1;//cause we know that mid+1 element> mid element 
            }
        }
        return start; 
    }
}
