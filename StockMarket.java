public class StockMarket {
    public static void main(String args[]){
        char[] prices = {'9', '4', '5', '7', '3', '7', '4'};

        int buyindex = 0;
        int sellindex = 0;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i] - '0';

            for (int j = i + 1; j < prices.length; j++) {
                int PotentialProfit = prices[j] - '0' - currentPrice;

                if (PotentialProfit > maxProfit){
                        maxProfit = PotentialProfit;
                        buyindex = i;
                        sellindex = j;
                

                }

            }

        }

        System.out.println("Best time to buy is :" + prices[buyindex]);
        System.out.println("Best time to sell is :" + prices[sellindex]);

    }

}

