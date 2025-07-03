class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> visit=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(visit.contains(nums[i])){
                return true;
            }
            else{
                visit.add(nums[i]);
            }
        }
        return false;
    }
}