class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int cur=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    cur++;
                }
            }
            if(cur==1){
                ans= nums[i];
            }
            cur=0;
        }
        return ans;
    }
}