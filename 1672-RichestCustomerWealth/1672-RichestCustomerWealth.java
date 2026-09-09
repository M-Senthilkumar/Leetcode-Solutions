// Last updated: 9/9/2026, 4:19:39 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int rich=0;
        for(int i=0;i<accounts.length;i++)
        {
            int wealth=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                wealth+=accounts[i][j];
            }
            rich=Math.max(rich,wealth);
        }
        return rich;
    }
}