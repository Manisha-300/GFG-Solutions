class Solution {
    public int binarySubstring(String s) {
        // code here
          int countOnes = 0;
        
        // Count the number of '1's in the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                countOnes++;
            }
        }
        
        // Number of substrings = nC2 = n*(n-1)/2
        return countOnes * (countOnes - 1) / 2;
    
    }
}