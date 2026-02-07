import java.util.*;
public class java_5 {
    public static int buyAndSellStocks(int price[]) {
        int maxProfit = 0;
        int buyingPrice = Integer.MAX_VALUE;

        for(int i=0; i<price.length; i++) {
            // case 1 buy price < todays price (i.e. Selling price)
            if(buyingPrice < price[i]) {
                int profit = price[i] - buyingPrice;    // todays profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // case 2 where case 1 fails i.e. todays price (selling price) is less than buying price
                buyingPrice = price[i];
            }
        }
        return maxProfit;        
    }

    public static void main(String args[]) {
        int price[] ={7, 1, 5, 3, 6, 4};        // todays price
        System.out.println(buyAndSellStocks(price));
    }
}