// Last updated: 8/11/2026, 10:04:48 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int res=0;
for(int i=0;i<mat.length;i++)
{
    res+=mat[i][i];
    res+=mat[i][mat.length-1-i];
}
if(mat.length%2 !=0)

    res-=mat[mat.length/2][mat.length/2];
    return res;

}
}