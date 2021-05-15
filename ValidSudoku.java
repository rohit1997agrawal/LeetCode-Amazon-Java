class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        if(board == null)
            return false;
        
       Set<String> set = new HashSet<String>();       
        for(int i = 0 ; i< 9; i++)
        {
            for(int j= 0 ; j<9 ; j++)
            {
                int num= board[i][j]-'0';
                if(num>=1 && num<=9)
                {
                    int block = (i / 3 * 3) + (j / 3);
                    if(!set.add("row"+i+num)||
                       !set.add("col"+j+num)||
                       !set.add("block"+block+num)
                    )
                    {
                        return false;
                    }
                   
               }
            }
        }
        return true;
        
    }
}
