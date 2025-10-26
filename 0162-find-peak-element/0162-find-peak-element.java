class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=1;i<=n-1;i++){
            int element=0;
            if(nums[0]>nums[0+1]){
                element=0;
            }
            else if(nums[n-1]>nums[n-2]){
                element=n-1;
            }
            else if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                element=i;
            }
            ans=Math.max(ans,element);
        }
        return ans;
    }
}