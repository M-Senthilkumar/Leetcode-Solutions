// Last updated: 8/11/2026, 10:10:38 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int longest=0;
        for(int num:nums)
        {
            set.add(num);
        }
         for(int num:set)
         {
            if(!set.contains(num-1))
            {
             int currnum=num;
             int count =1;
             while(set.contains(currnum+1))
             {
                count ++;
                currnum++;
             }
             longest=Math.max(longest,count);

            }
         }
        return longest;
    }
}