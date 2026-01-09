class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] res = new int[nums.length];
        //initialize index with 1
        for(int i=0;i<res.length;i++){
            res[i]=1;
        }
        //start first pointer
        for(int i=1;i<nums.length;i++){
            //start senond pointer 
            for(int j=0;j<=i;j++){
                if(nums[i]>nums[j]){
                    if(res[j]+1 > res[i]){
                        res[i]=res[j]+1;
                    }
                }
            }
        }
        //find thr maxvalue index of the result array
        int maxInd=0;
        for(int i=0;i<res.length;i++){
            if(res[i]>res[maxInd]){
                maxInd=i;
            }
        }
        return res[maxInd];
    }
}