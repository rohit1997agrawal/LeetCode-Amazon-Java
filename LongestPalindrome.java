class Solution {
    public String longestPalindrome(String s) {
        
        
        //Using dynamic programming - complexity - O(n^2)
        
        int maxLength=0;
        int start=0;
        int n = s.length();
        
        int[][] dp = new int[n][n];
        
        //First fill for all diagonal, as each character is substring 
        
         maxLength=1;
        for(int i=0 ; i<n ; i++)
        {
            dp[i][i]=1;
        }
        
        //Next for all with length 2
        
        for(int i=0 ; i<n-1 ; i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                dp[i][i+1]=1;
                maxLength=2;
                start = i;
            }
        }
        
        
        //Next for length 3 and above
        
        for(int k=3; k<=n ; k++)
        {
           
            for(int j=0 ; j<=n-k ; j++)
            {
                if(s.charAt(j)==s.charAt(j+k-1) && dp[j+1][j+k-2]==1)
                {
                     dp[j][j+k-1]=1;
                    if(k>maxLength)
                    {
                         maxLength=k;
                        start = j;
                       
                       
                    }
                    
                }
            }
        }
        
        String result="";
        for(int i=start ; i<start+maxLength ; i++)
        {
            result = result + s.charAt(i);
        }
        return result;
        
        
        
        
        
        
//Brute Force Approach  - Time complexity O(n^3)      
//         String flag="";
        
//         for(int i=0 ; i<s.length() ; i++)
//         {
//              String temp="";
            
//             for(int j=i; j<s.length() ; j++)
//             {
               
//                temp=temp+s.charAt(j);
//                // System.out.println(temp);
//                 boolean pallindrome=true;
//                 int l=0;
//                 int h=temp.length()-1;
//                 while(l<h)
//                 {
//                     if(temp.charAt(l++)!=temp.charAt(h--))
//                         pallindrome=false;
//                 }
//                 if(pallindrome && temp.length()>flag.length())
//                 {
//                     flag=temp;
//                 }
                
//             }
//         }
        
//         return flag;
        
        
    }
}
