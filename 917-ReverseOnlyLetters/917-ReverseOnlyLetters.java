// Last updated: 9/9/2026, 4:20:33 PM
class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = s.length()-1 ; i >= 0 ; i--) {
            char c1 = s.charAt(i);
            if (Character.isLetter(c1)) str.append(c1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (!Character.isLetter(c1)) str.insert( i , c1);
        }
        return str.toString();
    }
}