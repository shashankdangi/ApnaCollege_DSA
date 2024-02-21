package Array;

public class Buy_SellStocks {
    public static void main(String[] args) {
        int num[] = {7,1,5,3,6,4};
        int ans =  buySell(num);
        System.out.println(ans);
    }
    public static int buySell(int num[]){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i = 0 ; i< num.length; i++){
            if(buyPrice < num[i]){
                int profit = num[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit );

            }else{
                buyPrice = num[i];
            }
        }
        return maxProfit;
    }


}
