// User function Template for Java

class Solution {
    public int numOfSubset(int[] arr) {
        // Your code goes here
         Arrays.sort(arr);
        int count = 1; // At least one subset

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + 1)
                count++; // Gap found → new subset
        }

        return count;
    
    }
}