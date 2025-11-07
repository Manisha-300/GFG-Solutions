class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
         int[] last = new int[256];
        for (int i = 0; i < 256; i++) last[i] = -1;
        int start = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (last[s.charAt(i)] >= start)
                start = last[s.charAt(i)] + 1;
            last[s.charAt(i)] = i;
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}