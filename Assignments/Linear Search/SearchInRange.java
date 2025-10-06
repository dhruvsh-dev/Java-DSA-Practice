
import java.util.Scanner;


public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int[] arr={22,25,14,55,98,69};
        System.out.print("Enter the target: ");
        int target=sc.nextInt();
        System.out.print("Enter the start range: ");
        int start=sc.nextInt();
        System.out.print("Enter the end range: ");
        int end=sc.nextInt();
        System.out.println(searchRange(arr, start,end,target));
    }
    static int searchRange(int[]arr,int start,int end,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<end;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
