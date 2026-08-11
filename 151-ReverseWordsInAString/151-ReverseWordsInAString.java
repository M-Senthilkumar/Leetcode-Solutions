// Last updated: 8/11/2026, 10:10:29 PM
class Solution {
    public String reverseWords(String s) {
        String [] str=s.trim().split("\\s+");
      StringBuilder  result=new StringBuilder();
        for(int i=str.length-1;i>=0;i--)
        {
          result.append(str[i]);
          if(i!=0)
          {
            result.append(" ");
          }
        }
        return result.toString();
    }
}