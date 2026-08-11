// Last updated: 8/11/2026, 10:12:13 PM
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++)
        {
       if(haystack.startsWith(needle,i)){
       return i;
    }
}
return -1;
    }
}