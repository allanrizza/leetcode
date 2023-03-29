class Solution {
    public int maxProfit(int[] prices) {
        int leastPrice = Integer.MAX_VALUE;
        int soldToday = 0;
        int maxProfit = 0;

        for (int price : prices) {
            if(price < leastPrice) {
                leastPrice = price;
            }
            soldToday = leastPrice - price;
            if(soldToday > maxProfit) {
                maxProfit = soldToday;
            }
        }
        return maxProfit;
    }
}