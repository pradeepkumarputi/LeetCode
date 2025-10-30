class Solution {
    public boolean possible(int[] arr,int divisor,int threshold){
        int n=arr.length;
        long sum=0;
        for(int i=0;i<n;i++){
           sum+=(long)Math.ceil((double)arr[i]/divisor);
        }
        if(sum<=threshold){
            return true;
        }
        
        return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        // long sum=Arrays.stream(nums).sum();
        // if(sum<=threshold) return 1;
        int n=nums.length;
        // int min=Arrays.stream(nums).min().getAsInt();
        int max=Arrays.stream(nums).max().getAsInt();
        int ans=max;
        int start=1;
        int end=max;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(possible(nums,mid,threshold)==true){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return ans;
    }
}