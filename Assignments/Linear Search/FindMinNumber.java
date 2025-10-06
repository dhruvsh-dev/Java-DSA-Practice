
public class FindMinNumber {
    public static void main(String[] args) {
        int[] arr={22,25,14,55,98,69};
        System.out.println(MinNumber(arr));
    }
    static int MinNumber(int[]arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
