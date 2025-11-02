public class findInMountainArray {
    
    int search(int[] arr ,int target){
        int peak =findPeakElement(arr);
        int firstTry= orderAgnosticbinarySearch(arr, target, 0, peak);
        if(firstTry!=-1){
            return firstTry;
        }
        //Try to search in second half 
        return orderAgnosticbinarySearch(arr, target, peak+1,arr.length-1);

    }

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
    static int orderAgnosticbinarySearch(int[] arr, int target,int start, int end ){
       
        //Check is array in  ascending or descending order
        boolean isAscen=arr[start]<arr[end];

        while (start<=end) { 
            //Find the middle element
            int mid = start + (end-start) / 2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAscen){if(target < arr[mid]){
                end= mid-1;
            }else {
                start= mid +1;
            }
            }else{
                if(target > arr[mid]){
                end= mid-1;
            }else {
                start= mid +1;
            }
            }
        }
        return -1;
    }
}

