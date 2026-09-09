// Last updated: 9/9/2026, 4:20:50 PM
class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        Set<Integer> set=new HashSet<>();
        int maxlen=0;
        for(int num:arr)
        {
            set.add(num);
        }
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int a=arr[i];
                int b=arr[j];
                int len=2;
                while(set.contains(a+b))
                {
                    int c=a+b;
                    a=b;
                    b=c;
                len++;
                }
                maxlen=Math.max(maxlen,len);
            }
        }
        return maxlen>2?maxlen:0;
    }
}