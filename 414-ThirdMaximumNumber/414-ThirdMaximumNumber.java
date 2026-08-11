// Last updated: 8/11/2026, 10:07:42 PM
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int distinctCount = 1; 
        int last = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != last) {
                distinctCount++;
                last = nums[i];
            }
            if (distinctCount == 3) {
                return last;
            }
        }

        return nums[nums.length - 1]; 
    }
}
