class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list =new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int freq=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    freq++;
                }
            }
            if(freq>n/3){
                if(list.contains(nums[i])){
                    continue;
                }
                else{
                    list.add(nums[i]);
                }
                
            }
            
        }
        return list;
    }

}