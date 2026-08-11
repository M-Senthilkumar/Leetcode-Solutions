// Last updated: 8/11/2026, 10:10:16 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]<nums[mid+1])
            {
                low=low+1;
            }
            else
            {
                high=high-1;

            }
        }
        return low;
        
    }
}