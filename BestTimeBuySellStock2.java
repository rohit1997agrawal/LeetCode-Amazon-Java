class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices == null || prices.length ==0)
            return 0;
        
        int max=0;
        int lowest =prices[0];
        int total=0;
        
        for(int i=1 ; i<prices.length ; i++)
        {
            if(prices[i]<lowest)
            { lowest=prices[i];
            }
            else if(prices[i]-lowest > 0)
            {
                max = prices[i]-lowest;
                lowest=prices[i];
                total+=max;
            }
            
        }
        
        return total;
    }
}
