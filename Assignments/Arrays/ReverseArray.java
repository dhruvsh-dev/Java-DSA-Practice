import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr= {1,3,14,55};
        Reverse(arr);
        System.out.print(Arrays.toString(arr));
    }
    static  void swap(int[]arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }


    static void Reverse(int[]arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    }
