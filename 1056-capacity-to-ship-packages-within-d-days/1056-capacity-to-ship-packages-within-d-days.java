class Solution {
     public int possible(int[] arr,int mid){
        int n=arr.length;
        int countday=1;
        long sum=0;
        for(int i=0;i<n;i++){
            if(sum+arr[i]>mid){
                countday++;
                sum=arr[i];
            }
            else{
                sum=sum+arr[i];
            }
        }
       return countday;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int sum=Arrays.stream(weights).sum();
        int max=Arrays.stream(weights).max().getAsInt();
        int start=max;
        int end=sum;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(possible(weights,mid)<=days){
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