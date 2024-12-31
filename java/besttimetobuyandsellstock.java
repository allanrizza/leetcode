class Solution {
    public int maxProfit(int[] prices) {
        int lessPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int tmpSellValue = 0;
        for(int price : prices) {
            if(price < lessPrice) {
                lessPrice = price;
            }
            tmpSellValue = price - lessPrice;
            if(tmpSellValue > maxProfit) {
                maxProfit = tmpSellValue;
            }
        }
        return maxProfit;
    }
}