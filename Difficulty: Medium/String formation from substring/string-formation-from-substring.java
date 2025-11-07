// User function Template for Java

class Solution {
    int isRepeat(String s) {
        // code here
         String doubled = s + s;
        return doubled.substring(1, doubled.length() - 1).contains(s) ? 1 : 0;
    }
    
}