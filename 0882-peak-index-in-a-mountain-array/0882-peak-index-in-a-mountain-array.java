class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int low=1;
        int end=n-2;
        if(n==1){
            return 0;
        }
        else if(arr[0]>arr[0+1]){
            return 0;
        }
        else if(arr[n-1]>arr[n-2]){
            return n-1;
        }
        while(low <= end){
            
            int mid=low+(end-low)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] >arr[mid+1]){
                return mid;
            }
            if(arr[mid]> arr[mid-1]){
                low=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}