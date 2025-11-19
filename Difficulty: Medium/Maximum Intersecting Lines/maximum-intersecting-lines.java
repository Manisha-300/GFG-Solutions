// User function Template for Java

class Solution {
    public int maxIntersections(int[][] lines, int N) {
        // Code here
         int[] start = new int[N];
        int[] end = new int[N];

        for (int i = 0; i < N; i++) {
            start[i] = lines[i][0];
            end[i] = lines[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0, j = 0, count = 0, maxCount = 0;

        while (i < N && j < N) {
            // inclusive intersection => <= instead of <
            if (start[i] <= end[j]) {
                count++;
                maxCount = Math.max(maxCount, count);
                i++;
            } else {
                count--;
                j++;
            }
        }
        return maxCount;
        
    }
}
