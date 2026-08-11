// Last updated: 8/11/2026, 10:11:38 PM
class Solution {
    public int maxSubArray(int[] nums) {
      int maxsum=Integer.MIN_VALUE; 
      int currentsum=0; 
      for(int i=0;i<nums.length;i++)
      {
        currentsum+=nums[i];

        if(currentsum>maxsum)
        {
            maxsum=currentsum;
        }
        if(currentsum<0)
        {
            currentsum=0;
        }
      }
      return maxsum;
    }
}