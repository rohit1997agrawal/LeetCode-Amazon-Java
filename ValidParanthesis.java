class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        if(s.length()==0 || s==null || s.length()%2!=0)
        {
            return false;
        }
        
        for(int i=0 ; i<s.length() ; i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[' )
            {
                stack.push(s.charAt(i));
            }
            else{
                //Adding # as placeholder
                 char pop='#';
                if(!stack.empty())
                     pop = stack.pop();
                if((s.charAt(i)==')'  && pop == '(' ) || (s.charAt(i)=='}'  && pop == '{' ) || (s.charAt(i)==']'  && pop == '[' )  )
                {
                    continue;
                }
                else{
                    return false;
                }
            }
            
        }
        
        if(stack.empty())
        {
            return true;
        }
        
        return false;
        
    }
}
