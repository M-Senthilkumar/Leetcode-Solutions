// Last updated: 9/9/2026, 4:19:28 PM
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