class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int major=0;
        int freq=0;
        for(int i=0;i<n;i++){
            if(freq==0){
                major=nums[i];
            }
            if(major==nums[i]){
                freq++;
            }
            else{
                freq--;
            }
           
        }
        return major;
    }
}