// Last updated: 8/11/2026, 10:06:28 PM
class Solution {
    public boolean checkValidString(String s) {
         int low = 0, high = 0;
        for (char c : s.toCharArray()) {
            low += (c == '(') ? 1 : -1;
            high += (c != ')') ? 1 : -1;
            if (high < 0) return false;
            low = Math.max(low, 0);
        }
        return low == 0;
    }

    }
