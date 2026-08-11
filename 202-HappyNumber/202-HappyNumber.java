// Last updated: 8/11/2026, 10:09:46 PM
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen=new HashSet<>();
        while(n!=1 && !seen.contains(n))
        {
            seen.add(n);
            n=getSum(n);
        }
        return n==1;
    }
        private int getSum(int n)
        {
            int su=0;
            while(n>0)
            {
                int dig=n%10;
                su+=dig*dig;
                n=n/10;
            }
        
        return su;
    }
}