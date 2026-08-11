// Last updated: 8/11/2026, 10:03:54 PM
class Solution {
    public char kthCharacter(int k) {
        return (char)('a'+Integer.bitCount(k-1));
    }
}                                                      
