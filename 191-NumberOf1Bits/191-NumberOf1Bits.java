// Last updated: 8/11/2026, 10:09:53 PM
class Solution {
    public int hammingWeight(int n) {
        int ones = 0;
    	while(n!=0) {
    		ones = ones + (n & 1);
    		n = n>>>1;
    	}
    	return ones;
    }
}