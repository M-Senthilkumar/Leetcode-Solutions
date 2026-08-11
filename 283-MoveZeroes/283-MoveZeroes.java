// Last updated: 8/11/2026, 10:08:32 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int pointer1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int temp=nums[pointer1];
                nums[pointer1]=nums[i];
                nums[i]=temp;
                    pointer1++;
            }
        }
    }
}