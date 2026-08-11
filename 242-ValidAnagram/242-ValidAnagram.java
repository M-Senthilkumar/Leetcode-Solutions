// Last updated: 8/11/2026, 10:08:39 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        boolean res=false;
        if(s1.length!=s2.length)
        {
            res= false;
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2)){
            res= true;
        }
        return res;
    }
}