// Last updated: 8/11/2026, 10:07:02 PM
class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minutes=new ArrayList<>();
        for(String time:timePoints)
        {
            String [] parts=time.split(":");
            int hour=Integer.parseInt(parts[0]);
            int min=Integer.parseInt(parts[1]);
            minutes.add(hour*60+min);
        }
        Collections.sort(minutes);
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<minutes.size();i++)
        {
            ans=Math.min(ans,minutes.get(i)-minutes.get(i-1));
        }
        return ans=Math.min(ans,1440-minutes.get(minutes.size()-1)+minutes.get(0));
    }
}