public class floor {
    public static void main(String[] args) {
        int arr[]={2,5,7,8,14,17,22,45};
        int target=15;
        int ans=floor(arr, target);
        System.out.println(ans);
    }    
    
    static int floor(int arr[], int target){
        int start=0;
        int end= arr.length()-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(target< arr[mid]){
                end=mid-1;
            }
            else if(target > arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
           
        }
        return start;
    }
}

