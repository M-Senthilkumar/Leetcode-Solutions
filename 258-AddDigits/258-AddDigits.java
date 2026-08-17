// Last updated: 8/17/2026, 11:25:15 AM
1class Solution {
2    public int addDigits(int num) {
3        while(num>=10)
4        {
5        int rev=0;
6        while(num!=0)
7        {
8            int dig=num%10;
9            rev+=dig;
10            num=num/10;
11        }
12        num=rev;
13        }
14        return num;
15    }
16}