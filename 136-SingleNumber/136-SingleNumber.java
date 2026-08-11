// Last updated: 8/11/2026, 10:10:33 PM
class Solution {
    public int singleNumber(int[] nums) {
       int result =0;
        for(int num:nums){
            System.out.print(result);
            result^=num;
        }
        return result; 

    }
}