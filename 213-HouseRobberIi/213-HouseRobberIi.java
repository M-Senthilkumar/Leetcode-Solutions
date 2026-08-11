// Last updated: 8/11/2026, 10:09:29 PM
class Solution {
    public int rob(int[] nums) {

        if (nums.length == 1)
            return nums[0];

        return Math.max(helper(nums, 0, nums.length - 2),
                        helper(nums, 1, nums.length - 1));
    }

    public int helper(int[] nums, int start, int end) {

        int prev1 = 0;
        int prev2 = 0;

        for (int i = start; i <= end; i++) {

            int curr = Math.max(prev1, prev2 + nums[i]);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}