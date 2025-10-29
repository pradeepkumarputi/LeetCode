class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
        int start=1,end=max;
        int ans=max;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long ch = 0;

            for (int pile : piles) {
                ch += (long)Math.ceil((double)pile / mid);
            }

            if (ch <= h) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}