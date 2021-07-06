class Solution {
    public int lengthOfLastWord(String s) {
        
       
        int k = s.length()-1;
        
        
        int lastWord=0;
        while(s.charAt(k)==' ' && k!=0)
            k--;
        for( int i=k; i>=0 ; i--)
        {
            if(s.charAt(i) == ' ' )
                break;
            lastWord++;
            
        }
        return lastWord;
        
    }
}
