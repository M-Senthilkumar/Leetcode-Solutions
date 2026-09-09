// Last updated: 9/9/2026, 4:19:40 PM
class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        var max=0;
        var count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                count++;
            }
            else if(c==')'){
                count--;
            }
            max=Math.max(max,count);
        }
        return max;

    }
}