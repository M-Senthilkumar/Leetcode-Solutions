// Last updated: 8/11/2026, 10:07:37 PM
class Solution {
    public int countSegments(String s) {
        String[] str = s.split(" ");
        int count = 0;
        for (String i : str)
        {
            if (!Objects.equals(i, ""))
            {
                count++;
            }
        }
        return count;
    }
}