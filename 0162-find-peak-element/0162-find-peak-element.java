class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int low=1;
        int end=n-2;
        if(n==1){
            return 0;
        }
        else if(nums[0]>nums[0+1]){
            return 0;
        }
        else if(nums[n-1]>nums[n-2]){
            return n-1;
        }
        while(low <= end){
            
            int mid=low+(end-low)/2;
            if(nums[mid] > nums[mid-1] && nums[mid] >nums[mid+1]){
                return mid;
            }
            if(nums[mid]> nums[mid-1]){
                low=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}