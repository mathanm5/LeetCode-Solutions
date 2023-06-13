class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1) return 0;

        int profit=0;
        int stock1=0;
        for(int stock2=1;stock2<prices.length;stock2++){
            if(prices[stock2]>prices[stock1]){
                profit=Math.max(profit,prices[stock2]-prices[stock1]);
            }
            else{
                stock1=stock2;
            }
        }
        return profit;
    }
}
