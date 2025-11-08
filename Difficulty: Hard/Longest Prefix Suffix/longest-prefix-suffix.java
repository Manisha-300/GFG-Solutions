class Solution {
    int getLPSLength(String s) {
        // code here
        int n = s.length();
        int[] lps = new int[n];
        int len = 0;  // length of the previous longest prefix suffix
        int i = 1;

        // Build LPS array (like in KMP)
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1]; // fallback
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        // The last value of lps[] gives length of longest prefix which is also suffix
        // but must not be equal to the entire string
        int result = lps[n - 1];
        return result;
    }
}