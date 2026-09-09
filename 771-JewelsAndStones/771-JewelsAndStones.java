// Last updated: 9/9/2026, 4:21:06 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<jewels.length();i++)
        { 
            char ch=jewels.charAt(i);
            for(int j=0;j<stones.length();j++)
            {
              if(ch==stones.charAt(j))
              {
                count++;
              }
            }
        }
        return count;
    }
}