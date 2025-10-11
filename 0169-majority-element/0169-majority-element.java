class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int major=nums[0];
        int freq=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                freq++;
            }
            else{
                freq=1;
                major=nums[i];
            }
            if(freq>n/2){
                return major;
            }
        }
        return major;
    }
}