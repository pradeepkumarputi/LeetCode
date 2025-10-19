class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int[] prefixSum=new int[n];
        prefixSum[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1] +nums[i];
        }
        Map <Integer,Integer> map =new HashMap<>();
        for(int j=0;j<n;j++){
            if(prefixSum[j]==k) count++;
            int value=prefixSum[j]-k;
            if(map.containsKey(value)){
                count+=map.get(value);
            }
            map.put(prefixSum[j],map.getOrDefault(prefixSum[j],0)+1);

        }
        return count;
    }
}