// Last updated: 8/11/2026, 10:06:31 PM
class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] > nums[i + 1]) {
                count++;

                if (count > 1)
                    return false;

                if (i == 0 || nums[i - 1] <= nums[i + 1]) {
                    nums[i] = nums[i + 1];
                } else {
                    nums[i + 1] = nums[i];
                }
            }
        }

        return true;
    }
}