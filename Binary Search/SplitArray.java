public class SplitArray {
    public static void main(String[] args) {
      int[] nums={7,2,5,10,8};
        int ans=splitArray(nums, 2);
        System.out.println(ans);

    }
    static int splitArray(int[] nums, int m){
        int start=0;
        int end=0;
        for (int i = 0; i < nums.length; i++) {
            start=Math.max(start, nums[i]);
            end+=nums[i];

        }
        //bs
        while (start<end) {
            //try for mid as potenital ans
            int mid=start+(end-start)/2;
            //how many pieces you can divide
            int sum=0;
            int pieces=1;
            for (int i : nums) {
                if(sum+i>mid){
                    sum=i;
                    pieces++;
                }
                else{
                   sum+=i;
                }
                if(pieces>m){
                    start=mid+1;
                }
                else{
                    end=mid;
                }
            }

        }
        return end;
    }
}
