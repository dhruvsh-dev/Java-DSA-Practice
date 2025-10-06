
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={22,25,14,55,98,69};
        System.out.println(linearSearch2(arr, 55));
    }
    //search in the array : return the index if item found
    //otherwise return -1
    static int linearSearch(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        //run a for loop 
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    } 

    static Boolean linearSearch2(int[]arr,int target){
        if(arr.length==0){
            return true;
        }
        //run a for loop 
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element==target){
                return true;
            }
        }
        return false;
    } 
}
