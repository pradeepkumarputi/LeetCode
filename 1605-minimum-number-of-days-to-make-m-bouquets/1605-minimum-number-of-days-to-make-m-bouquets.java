class Solution {
    public boolean possible(int[] arr,int day,int m ,int k){
        int n=arr.length;
        int count=0;
        int nb=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                nb=nb+(count/k);
                count=0;
            }

        }
        nb=nb+(count/k);
        if(nb>=m){
            return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if ((long) m * k > n) return -1;
        int min=Arrays.stream(bloomDay).min().getAsInt();
        int max=Arrays.stream(bloomDay).max().getAsInt();
        int ans=max;
        int start=min;
        int end=max;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(possible(bloomDay,mid,m,k)==true){
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