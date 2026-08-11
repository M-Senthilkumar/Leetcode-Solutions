// Last updated: 8/11/2026, 10:08:03 PM
class Solution {
    public void reverseString(char[] s){
        int i=0;
        int j=s.length-1;
        while(i<j)
        {
            char temp = s[i];
            s[i]=s[j];
            s[j]= temp;
            i++;
            j--;

    }
    }
}
