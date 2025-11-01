class Solution {
    public int[] mergeArray(int[] arr1,int[] arr2){
        int n = arr1.length, m = arr2.length;
        int[] merged = new int[n + m];
        int i = 0, j = 0, k = 0;
 
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

 
        while (i < n) {
            merged[k++] = arr1[i++];
        }

        while (j < m) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = mergeArray(nums1, nums2);
        int n = ans.length;

        if (n % 2 == 1) {
            return ans[n / 2];
        } else { 
            return (ans[n / 2 - 1] + ans[n / 2]) / 2.0;
        }
    }
}