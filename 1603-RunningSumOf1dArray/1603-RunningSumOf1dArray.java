// Last updated: 8/11/2026, 10:04:58 PM
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++)
        {
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}