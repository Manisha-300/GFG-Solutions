// User function Template for Java

class Solution {
    public int minIncrements(int[] arr) {
        // Code here
        
        Arrays.sort(arr);
        int moves = 0;
        int prev = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= prev) {
                moves += (prev + 1 - arr[i]);
                arr[i] = prev + 1;  
            }
            prev = arr[i];
        }
        return moves;
    
    }
}