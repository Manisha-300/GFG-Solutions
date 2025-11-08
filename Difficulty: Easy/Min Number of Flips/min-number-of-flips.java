class Solution {
    public int minFlips(String s) {
        // Code here
        int n = s.length();
        int flipStartWith0 = 0; // pattern "0101..."
        int flipStartWith1 = 0; // pattern "1010..."

        for (int i = 0; i < n; i++) {
            char expectedFor0 = (i % 2 == 0) ? '0' : '1';
            char expectedFor1 = (i % 2 == 0) ? '1' : '0';

            if (s.charAt(i) != expectedFor0) flipStartWith0++;
            if (s.charAt(i) != expectedFor1) flipStartWith1++;
        }

        return Math.min(flipStartWith0, flipStartWith1);
    }
}