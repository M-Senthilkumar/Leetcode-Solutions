// Last updated: 8/11/2026, 10:07:10 PM
class Solution {
    public int findMinMoves(int[] machines) {
        int sum=0;
        for(int x:machines)
        {
            sum+=x;
        }
        int n=machines.length;
        if(sum%n!=0)
        {
            return -1;
        }
        int avg=sum/n;
        int steps=0;
        int need=0;
        for(int i=0;i<n;i++)
        {
            int diff=machines[i]-avg;
            need+=diff;
            steps=Math.max(steps,Math.max(Math.abs(need),diff));
        }
        return steps;
    }
}