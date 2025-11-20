class Solution {
    public int[] twoRepeated(int[] arr) {
        int n = arr.length - 2;

        int[] freq = new int[n + 1];
        int[] ans = new int[2];
        int idx = 0;

        for (int x : arr) {
            freq[x]++;

            if (freq[x] == 2) {   // second appearance
                ans[idx++] = x;
                if (idx == 2) break;
            }
        }

        return ans;
    }
}
