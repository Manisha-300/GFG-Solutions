// User function Template for Java

class Solution {
    public int minLaptops(int n, int[] start, int []end) {
        // code here
           Arrays.sort(start);
        Arrays.sort(end);

        int i = 0, j = 0;
        int laptops = 0, maxLaptops = 0;

        while (i < n && j < n) {
            if (start[i] < end[j]) {
                laptops++;
                maxLaptops = Math.max(maxLaptops, laptops);
                i++;
            } else {
                laptops--;
                j++;
            }
        }
        return maxLaptops;
    }
}