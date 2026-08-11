// Last updated: 8/11/2026, 10:10:21 PM
class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int ans=nums[0];
        int ppro=1;
        int spro=1;
        for(int i=0;i<n;i++)
        {
            ppro*=nums[i];
            spro*=nums[n-i-1];
            ans=Math.max(ans,Math.max(ppro,spro));
            if(ppro==0) ppro=1;
            if(spro==0) spro=1;
        }
        return ans;
    }
}