
public class _02BuyAndSellStock {
    public static int BuyandSellStock(int Price[]) {
        int BuyPrice = Integer.MAX_VALUE;
        int MAX_Day_Profit = 0;

        for (int i = 0; i < Price.length; i++) {
            if (BuyPrice < Price[i]) {
                int Profit = Price[i] - BuyPrice;
                MAX_Day_Profit = Math.max(Profit, MAX_Day_Profit);
            } else {
                BuyPrice = Price[i];
            }
        }
        return MAX_Day_Profit;
    }

    public static void main(String[] args) {
        int Price[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(BuyandSellStock(Price));
    }
}
