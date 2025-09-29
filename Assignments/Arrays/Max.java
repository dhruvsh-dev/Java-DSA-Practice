public class Max {
    public static void main(String[] args) {
        int[] arr= {1,12,45,55};
        System.out.println(Max(arr));
        System.out.println(RangeMax(arr, 0,1 ));
    }
    static int Max(int[]arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int RangeMax(int[]arr,int start,int end){
        int max=arr[start];
        for (int i = 1; i <= end; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
