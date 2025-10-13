class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=prices[0];
        int maxprofit=0;
        for(int i=0;i<n;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            maxprofit=Math.max(maxprofit,prices[i]-buy);
        }
        return maxprofit;
    }
}