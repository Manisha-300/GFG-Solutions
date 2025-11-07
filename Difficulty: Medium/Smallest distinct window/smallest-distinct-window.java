// User function Template for Java

class Solution {
    public int findSubString(String s) {
        // code here
         int unique = (int) s.chars().distinct().count();
        int[] freq = new int[256];
        int start = 0, count = 0, min = s.length();

        for (int end = 0; end < s.length(); end++) {
            if (++freq[s.charAt(end)] == 1) count++;
            while (count == unique) {
                min = Math.min(min, end - start + 1);
                if (--freq[s.charAt(start++)] == 0) count--;
            }
        }
        return min;
    }
}