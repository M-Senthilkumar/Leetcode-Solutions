// Last updated: 8/11/2026, 10:05:36 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int boat=0;
        while(left<=right)
        {
         if(people[left]+people[right]<=limit)
         {
            left++;
         }
         right--;
         boat++;
        }
        return boat;
    }
}