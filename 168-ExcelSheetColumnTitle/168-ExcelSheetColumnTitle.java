// Last updated: 8/11/2026, 10:10:13 PM
class Solution {
    public String convertToTitle(int columnNumber) {
              StringBuilder result = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--; 
            char ch = (char) ('A' + (columnNumber % 26));
            result.insert(0, ch);
            columnNumber /= 26;
        }
        
        return result.toString();
  
    }
}