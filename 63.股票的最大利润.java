class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1 || prices == null){
            return 0;
        }
        /* ///sliding window
        int left = 0;
        int max = 0;
        int i = 1;
        while(i < prices.length){
            if(prices[i] <= prices[left]){
                left = i;
                i++;
            }else{
                max = Math.max(max, prices[i] - prices[left]);
                i++;
            }
        }
        return max;
        */

        //pinamic programming
        //dp[i] = max(dp[i - 1], prices[i] - min(prices[0:i-1]))
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int price : prices){
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
