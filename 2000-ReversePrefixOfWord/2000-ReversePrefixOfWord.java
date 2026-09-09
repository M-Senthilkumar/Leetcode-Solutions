// Last updated: 9/9/2026, 4:19:23 PM
class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch); 
          return index >= 0 ? 
                new StringBuilder(word.substring(0,index+1))
                .reverse()
                .append(word.substring(index+1,word.length()))
                .toString() : 
                word;
    }
}