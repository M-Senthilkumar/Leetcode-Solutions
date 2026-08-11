// Last updated: 8/11/2026, 10:09:18 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> set=new HashSet<>();
            for(int num:nums)
            {
                if(set.contains(num))
                {
                    return true;
                }
                set.add(num);
            }
        
        return false;
    }
}