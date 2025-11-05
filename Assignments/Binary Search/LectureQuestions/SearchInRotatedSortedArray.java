public class SearchInRotatedSortedArray {
    //LeetCode 33
    public static void main(String[] args) {}
    
    static  int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        //if you don't find the pivot, so the array is not rotated
        if(pivot==-1){
            binarySearch(nums, target,0,nums.length-1);
        }
        //if pivot is find
        if(nums[pivot]==target){
            return pivot; 
        }
        if(target>=nums[0]){
            return binarySearch(nums, target, 0, -1);
        }
        return binarySearch(nums, target, pivot+1,nums.length-1);
    }
     static int findPivot(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            //4 Cases
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]<arr[mid-1]){
                return mid-1;
            }else if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target,int start,int end){
        
        while (start<=end) { 
            //Find the middle element
            int mid = start + (end-start) / 2;
            if(target<arr[mid]){
                end= mid-1;
            }else if(target>arr[mid]){
                start= mid +1;
            }
            else{
                //Answer Found
                return  mid;
            }
        }
        return -1;
    }
}
