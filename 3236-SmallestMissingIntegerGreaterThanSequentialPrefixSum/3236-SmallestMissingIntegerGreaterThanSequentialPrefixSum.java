// Last updated: 8/11/2026, 10:04:13 PM
class Solution {
    public int missingInteger(int[] nums) {
        int countsum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]+1==nums[i])
            {
                countsum+=nums[i];
            }
            else
            break;

        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(countsum==nums[i])
            {
                countsum++;
            }
        }
        return countsum;
    }
}