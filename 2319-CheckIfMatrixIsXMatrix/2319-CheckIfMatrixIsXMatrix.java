// Last updated: 9/9/2026, 4:19:11 PM
class Solution {
    public boolean checkXMatrix(int[][] grid) {
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                int val=grid[i][j];
                if((i==j) || (i+j==grid.length-1))
                {
                    if(val==0)
                    {
                        return false; 
                    }
                }
                else if(val!=0)
                {
                    
                        return false;
                }
            }
        }
        return true;
    }
}