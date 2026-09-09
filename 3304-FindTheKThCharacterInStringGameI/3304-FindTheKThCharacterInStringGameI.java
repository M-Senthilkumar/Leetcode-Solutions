// Last updated: 9/9/2026, 4:18:49 PM
class Solution {
    public char kthCharacter(int k) {
        return (char)('a'+Integer.bitCount(k-1));
    }
}                                                      
