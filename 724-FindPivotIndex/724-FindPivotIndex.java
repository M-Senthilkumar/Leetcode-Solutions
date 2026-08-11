// Last updated: 8/11/2026, 10:06:22 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int num:nums)
        {
            total+=num;
        }
        int left=0;
        for(int i=0;i<nums.length;i++)
        {
            int right=total-left-nums[i];
            if(left==right)
            {
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}