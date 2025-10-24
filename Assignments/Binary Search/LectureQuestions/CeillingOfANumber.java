
public class CeillingOfANumber {
    public static void main(String[] args) {
         int[] arr= {22,25,45,69,85,255};
        System.out.print(CeillingbinarySearch(arr, 69));
        //Ceilling = smallest element in array greater or equal to target element
    }
    static int CeillingbinarySearch(int[] arr, int target){
        //but what if target is gretaer than the gratest number in the array
        if(target > arr.length-1){
            return -1;
        }
        int start=0;
        int end=arr.length - 1;
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
        return start;
    }
}


