/**
 * peakIndex
 */
public class MountainArray {

    public static void main(String[] args) {
        
    }

    static int peakIndex(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start + (end-start)/2;
            if(arr[mid]> arr[mid+1]){
                //dec part of array
                end=mid;
            }
            else{// ascending part of array
                start=mid+1;

            }
        }
    // in the end start==end pointing to the largest
    return start;
    }
}