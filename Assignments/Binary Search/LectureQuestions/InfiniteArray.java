public class InfiniteArray {
    public static void main(String[] args) {
        
    
    }

    static int ans(int[]arr,int target){
        //First find the range 
        //Satrt with the size of box 2
        int start = 0;
        int end = 1;
        // condition for the target to lie in the range
        while(target > arr[end]){
            int newStart= end +1;
            //double box value
            end= end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
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
