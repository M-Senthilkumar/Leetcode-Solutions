// Last updated: 9/9/2026, 4:20:17 PM
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
     int ans = Integer.MIN_VALUE;
        int m = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] - i + m > ans) 
                ans = values[i] - i + m;
            
            if (values[i] + i > m) 
                m = values[i] + i;
        }

        return ans;
   
    }
}