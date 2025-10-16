
public class OrderAgnosticBinarySearch {
     public static void main(String[] args) {
        int[] arr= {-18,-15,-2,0,22,25,45,69,85,255};
        System.out.print(orderAgnosticbinarySearch(arr, 0));
    }
    //Return -1 if target not exists.
    static int orderAgnosticbinarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length - 1;
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

