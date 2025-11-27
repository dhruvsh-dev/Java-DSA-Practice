public class Floor {
    public static void main(String[] args) {
        int[] arr= {22,25,45,69,85,255};
        System.out.print(Floor(arr, 69));
    }
    //Greatest number less than or equal to target.
     static int Floor(int[] arr, int target){ 
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
        return end;
    }
}
