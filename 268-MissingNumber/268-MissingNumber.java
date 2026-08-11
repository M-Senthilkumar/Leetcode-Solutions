// Last updated: 8/11/2026, 10:08:35 PM
class Solution {
    public int missingNumber(int[] nums) {
        int result=nums.length;
        for(int i=0;i<nums.length;i++){
          result+=i-nums[i];


                     
        }
        return result;
    }
}