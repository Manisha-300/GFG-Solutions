// User function Template for Java

class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        Arrays.sort(arr);
        long count = 0;

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;
            while (l < r) {
                if (arr[i] + arr[l] + arr[r] < sum) {
                    count += (r - l); // all pairs from l+1 to r are valid
                    l++;
                } else r--;
            }
        }
        return count;
    }
}
