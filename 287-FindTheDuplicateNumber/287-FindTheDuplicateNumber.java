// Last updated: 8/11/2026, 10:08:27 PM
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int j=0;j<nums.length;j++)
        {
         if(set.contains(nums[j]))
        return nums[j];
        set.add(nums[j]);
        }
        return -1;
    }
}