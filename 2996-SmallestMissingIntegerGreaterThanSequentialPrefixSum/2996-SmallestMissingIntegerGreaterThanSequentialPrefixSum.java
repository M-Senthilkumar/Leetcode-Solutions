// Last updated: 9/9/2026, 4:19:04 PM
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