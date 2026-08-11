// Last updated: 8/11/2026, 10:04:31 PM
class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count=0;
        for(String word:words1)
        {
            if(frequency(words1,word)==1 && frequency(words2,word)==1)
            {
                count++;
            }
        }
        return count;
    }
        private int frequency(String arr[],String target)
        {
            int freq=0;
            for(String word:arr)
            {
                if(word.equals(target))
                {
                    freq++;
                }
            }
            return freq;
        }
    }
