// Last updated: 8/11/2026, 10:06:24 PM
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int cash=0;
        int hold=-prices[0];
        for(int i=1;i<prices.length;i++)
        {
            int prevcash=cash;
            cash=Math.max(cash,hold+prices[i]-fee);
            hold=Math.max(hold,prevcash-prices[i]);
        }
        return cash;
    }
}