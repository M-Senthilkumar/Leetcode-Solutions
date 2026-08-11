// Last updated: 8/11/2026, 10:12:40 PM
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int c=x;
        while(x>0)
        {
            rev=rev*10+x%10;
            x=x/10;
        }
        if(rev==c)
        {
            return true;
        }
        else {
           return false;
        }

    }
}