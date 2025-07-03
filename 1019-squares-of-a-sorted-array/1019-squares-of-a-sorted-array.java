class Solution {
    public void reverse(int[] arr){
        int i=0;int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public int[] sortedSquares(int[] nums) {
        int i=0;int j=nums.length-1;
        int[] ans=new int[nums.length];
        int k=0;
        while(i<=j){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                ans[k]=nums[i]*nums[i];
                k++;
                i++;
            }
            else{
                ans[k]=nums[j]*nums[j];
                k++;
                j--;
            }
            
        }
        reverse(ans);
        return ans;
    }
}