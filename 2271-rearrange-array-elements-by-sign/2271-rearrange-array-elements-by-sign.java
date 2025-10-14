class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }
        int k=0,l=0;
        for(int i=0;i<n;i++){
            
            if(i % 2==0){
                nums[i]=pos.get(k);
                k++;
            }
            else{
                nums[i]=neg.get(l);
                l++;
            }
        }
        return nums;
    }
}