class Solution {
    public static void reverseArray(int[] arr){
        int a=0;int b=arr.length-1;
        while(a<b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;b--;
        }
    }
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
            
        }
        if(pivot==-1){
                reverseArray(nums);
                return;
            }
        for(int i=n-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                int temp=nums[i];
                nums[i]=nums[pivot];
                nums[pivot]=temp;
                break;
            }
        }
        int a=pivot+1;
        int b=n-1;
        while(a<=b){
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
            a++;b--;
        }
    }
}