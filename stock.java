public class stock {
    public static void max_profit(int price[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<price.length;i++){
            if(buyprice<price[i]){
                int profit =price[i]-buyprice;
                maxprofit=Math.max(profit, maxprofit);
            }
            else{
                buyprice=price[i];
            }
        }
        System.out.println(maxprofit);
    }
    public static void main(String args[]){
        int price[]={7, 6, 4,  3, 1};
        max_profit(price);
    }
}  
    

