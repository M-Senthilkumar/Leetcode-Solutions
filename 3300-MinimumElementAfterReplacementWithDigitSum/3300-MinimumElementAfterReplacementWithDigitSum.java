// Last updated: 9/9/2026, 4:18:45 PM
class Solution {
    public int minElement(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            int sum=0;
            while(num>0)
            {
                sum+=(num%10);
                num/=10;
            }
            ans=Math.min(sum,ans);
        }
        return ans;
    }
}