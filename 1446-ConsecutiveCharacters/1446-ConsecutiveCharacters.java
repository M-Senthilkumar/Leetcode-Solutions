// Last updated: 9/9/2026, 4:19:58 PM
class Solution {
    public int maxPower(String s) {
        int count=1;
        int max=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            else{
                count=1;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}