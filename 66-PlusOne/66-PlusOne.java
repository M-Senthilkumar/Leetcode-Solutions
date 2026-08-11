// Last updated: 8/11/2026, 10:11:25 PM
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] != 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }   
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}