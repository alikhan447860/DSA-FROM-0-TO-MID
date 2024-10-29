public class StockBuySell {
    public static void main(String[] args) {
        int arr[]={7, 1, 5, 3, 6, 4};
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minprice){
                minprice=arr[i];
            }
            int profit=arr[i]-minprice;
            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        System.out.println("Maximum profit is "+maxprofit);
    }
}
