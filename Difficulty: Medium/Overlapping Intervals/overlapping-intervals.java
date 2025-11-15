class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
         ArrayList<int[]> result = new ArrayList<>();
        if (arr.length == 0) return result;

        // Sort intervals by start time
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int[] current = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] <= current[1]) {
                // Overlapping intervals, merge them
                current[1] = Math.max(current[1], arr[i][1]);
            } else {
                // No overlap, add current interval to result
                result.add(current);
                current = arr[i];
            }
        }

        // Add the last interval
        result.add(current);

        return result;
    
    }
}