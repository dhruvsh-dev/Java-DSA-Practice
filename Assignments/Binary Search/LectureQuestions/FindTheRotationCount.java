public class FindTheRotationCount {
    public static void main(String[] args) {}

    static int countRoatation(int[]arr){
        int pivot= findPivot(arr);
        return pivot+1;
    }

    static int findPivotWithDuplicat(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            //4 Cases
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //if elemnets at middle,start,end are equal then just skip the duplicates.
            else if(arr[mid]==arr[start] && arr[mid]== arr[end]){
                //skip the dupicates
                //NOTE: What if these elemets at start and end were the pivots??
                //check if start is Pivot
                if(arr[start]> arr[start+1]){
                    return start;
                }
                start++;
                //check wether end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted,so pivot should be in right 
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    static int findPivot(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            //4 Cases
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]<arr[mid-1]){
                return mid-1;
            }else if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
