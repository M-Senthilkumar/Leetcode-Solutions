// Last updated: 9/9/2026, 4:19:02 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxFreq = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int freq = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    freq++;
                }
            }

            if (freq > maxFreq) {
                maxFreq = freq;
                ans = freq;
            } 
            else if (freq == maxFreq) {
                ans += freq;
            }
        }

        return ans / maxFreq;
    }
}