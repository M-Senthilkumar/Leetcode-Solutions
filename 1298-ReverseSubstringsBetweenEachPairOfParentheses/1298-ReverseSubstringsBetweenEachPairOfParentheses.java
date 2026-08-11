// Last updated: 8/11/2026, 10:05:05 PM
class Solution {
    public String reverseParentheses(String s) {
           {
        Stack<String> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(ans.toString());
                ans.setLength(0);
            } else if (ch == ')') {
                ans.reverse();
                ans.insert(0, st.pop());
            } else {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
    }
}