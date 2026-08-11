// Last updated: 8/11/2026, 10:07:06 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalc=0;
        int n=word.length();
        for(int i=0;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                capitalc++;
            }
        }
        if(capitalc==n)
        {
            return true;
        }
        else if(capitalc==0)
        {
            return true;
        }
        else if(capitalc==1 && Character.isUpperCase(word.charAt(0)))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}