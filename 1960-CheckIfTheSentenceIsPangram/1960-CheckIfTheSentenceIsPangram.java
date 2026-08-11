// Last updated: 8/11/2026, 10:04:37 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)
        {
            return false;
        }
        for(char ch='a';ch<='z';ch++)
        {
          if(sentence.indexOf(ch)<0)
          {
            return false;
          }
        }
        return true;
    }
}