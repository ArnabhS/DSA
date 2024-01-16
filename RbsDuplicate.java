public class RbsDuplicate {
    public static void main(String[] args) {
        
    }


        
    static int findPivotwithDuplicates(int[] arr){
        int start=0;
        int end=arr.length-1;
      
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if( mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                // skip duplicates//check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;

                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid]||(arr[start]==arr[mid] && arr[end]<arr[mid])){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
       }
       return -1;
    }
   
}
