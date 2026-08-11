// Last updated: 8/11/2026, 10:10:43 PM
class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if((c>=65 && c<=90)|| (c>=97 && c<=122)|| (c>=48 && c<=57))
            {
                str+=c;
            }
        }
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
       if(str.equals(rev))
       {
        return true;
       }
       return false;
    }
}