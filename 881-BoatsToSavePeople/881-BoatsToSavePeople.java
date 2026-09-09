// Last updated: 9/9/2026, 4:20:39 PM
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