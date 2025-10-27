public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        
    }
//Leet Code 852
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end= arr.length -1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in des. part of the array
                end = mid;
            }else{
                start= mid + 1;//cause we know that mid+1 element> mid element
            }
        }
        //in the end , start==end and pointing to the largest number because of 2 checks above start and end are always trying to find max element in the above two checks hence they are pointing to just one element that is max one because that is what the checks say
        return start;
    }
}
