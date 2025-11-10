class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        
          int n = arr.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];

        // Initialize: sum = 0 is always possible (empty subset)
        for (int i = 0; i <= n; i++)
            dp[i][0] = true;

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] > j)
                    dp[i][j] = dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
            }
        }

        return dp[n][sum];
    }

   
    
}